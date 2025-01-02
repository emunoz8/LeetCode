import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import java.util.function.BiFunction;

public class TwoSum {
    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        BiFunction<int[], Integer, int[]>[] methods = new BiFunction[3];

        methods[0] = (int[] arr, Integer target) -> twoSum(arr, target);
        methods[1] = (int[] arr, Integer target) -> optimalSolution(arr, target);
        methods[2] = (int[] arr, Integer target) -> recursiveSolution(arr, target, 0, new HashMap<>());

        for (int i = 0; i < 10; i++) {
            allFunctions(methods);
            System.out.println();
        }
    }

    public static void allFunctions(BiFunction<int[], Integer, int[]>[] methods) {
        int target = 8;
        int[] answer;
        int[] nums = { 0, 2, 3, 5, 6, 0 };
        Long start, stop;

        for (BiFunction<int[], Integer, int[]> method : methods) {

            start = System.nanoTime();
            answer = method.apply(nums, target);
            stop = System.nanoTime();

            System.out.println("Time for " + method.getClass().getSimpleName() + ": " + (stop - start));

            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
        }

    }

    public static int[] recursiveSolution(int[] nums, int target, int i, HashMap<Integer, Integer> map) {
        int secondNum = target - nums[i];
        if (map.containsKey(secondNum))
            return new int[] { map.get(secondNum), i };

        map.put(nums[i], i);
        return recursiveSolution(nums, target, i + 1, map);
    }

    public static int[] optimalSolution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sol = new int[2];
        int secondNum;

        for (int i = 0; i < nums.length; i++) {
            secondNum = target - nums[i];

            if (map.containsKey(secondNum)) {
                sol[0] = map.get(secondNum);
                sol[1] = i;
                return sol;

            }
            map.put(nums[i], i);

        }

        return sol;

    }

    public static int[] twoSum(int[] nums, int target) {

        TreeMap<Integer, ArrayList<Integer>> tree = new TreeMap<>();
        int[] sol = new int[2];
        int l, r;
        boolean hasSolution = false;

        for (int i = 0; i < nums.length; i++) {
            tree.putIfAbsent(nums[i], new ArrayList<>());
            tree.get(nums[i]).add(i);
        }

        Iterator<Map.Entry<Integer, ArrayList<Integer>>> left = tree.entrySet().iterator();
        Iterator<Map.Entry<Integer, ArrayList<Integer>>> right = tree.descendingMap().entrySet().iterator();

        l = left.next().getKey();
        r = right.next().getKey();
        while (!hasSolution) {

            if (l + r == target) {
                if (l == r) {
                    sol[0] = tree.get(l).get(0);
                    sol[1] = tree.get(r).get(1);
                } else {
                    sol[0] = tree.get(l).get(0);
                    sol[1] = tree.get(r).get(0);
                }
                hasSolution = true;
            } else if (l + r > target) {
                r = right.next().getKey();
            } else {
                l = left.next().getKey();
            }

        }

        return sol;
    }

}