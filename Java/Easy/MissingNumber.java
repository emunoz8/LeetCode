public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = { 0, 5, 6, 7, 4, 3, 2, 8 };
        //System.out.println(Integer.toBinaryString(optimalMissingNumber(nums)));
        visualizeAnswer(nums);

    }

    //LeetCode, bitwise operator XOR
    //XOR operator is: 1 & 1 =0, 1 & 0 = 1, 0 & 1= 1;
    public static int optimalMissingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            xor ^= i;
        }
        xor ^= n;
        return xor;
    }

    //
    public static void visualizeAnswer(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int padding = (int) Math.ceil(Math.log(n + 1) / Math.log(2));

        for (int i = 0; i < n; i++) {
            display(xor, padding);
            display(nums[i], padding);
            xor ^= nums[i];
            System.out.println("--------XOR");
            display(xor, padding);
            display(i, padding);
            System.out.println("--------XOR");

        }
        display(xor, padding);
        display(n, padding);
        xor ^= n;
        System.out.println("--------XOR");
        display(xor, padding);

        System.out.println("final answer: " + xor);
    }

    public static void display(int num, int padding) {

        System.out.println(String.format("%" + padding + "s", Integer.toBinaryString(num)).replace(' ', '0'));
    }

    //first solution
    public static int missingNumber(int[] nums) {
        boolean[] appear = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            appear[nums[i]] = true;

        }

        for (int i = 1; i < appear.length; i++) {
            if (!appear[i])
                return i;
        }

        return 0;

    }

}