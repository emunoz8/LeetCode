public class ClimbingStairs {

    public static void main(String[] args) {

        int ans = climbingStairs(44);
        System.out.println(ans);

    }

    public static int climbingStairs(int n) {
        if (n == 1)
            return 1;

        int[] table = new int[n + 1];

        table[1] = 1;
        table[2] = 2;

        for (int i = 3; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        return table[n];

    }

    // recursive (from my noggin), ineffecient*******************//
    public static int recursiveClimbingStairs(int n) {
        int total = helper(n, 0);
        return total;
    }

    public static int helper(int target, int sum) {
        if (sum == target)
            return 1;
        if (sum > target)
            return 0;

        return helper(target, sum + 1) + helper(target, sum + 2);

    }
    // ******************************************//
}
