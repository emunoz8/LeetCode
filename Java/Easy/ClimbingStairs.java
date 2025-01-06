public class ClimbingStairs {

    public static void main(String[] args) {

        int ans = climbingStairs(2);
        System.out.println(ans);

    }

    // Seems like a permutation problem
    public static int climbingStairs(int n) {

        return (int) Math.pow(n, 2);
    }
}
