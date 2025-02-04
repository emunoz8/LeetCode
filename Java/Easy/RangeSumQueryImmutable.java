
//LeetCode answer, this answer stores the differences of adjacent numbers,
//when retriving the sum you subtract the left element -1 index from the right element. 
/*
    int[] dp;

    public NumArray(int[] nums) {
        this.dp = nums;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return dp[right];
        }
        return dp[right] - dp[left - 1];

    }
 */

//first attempt, super slow
class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += nums[i];

        }

        return sum;

    }
}

public class RangeSumQueryImmutable {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        NumArray arr = new NumArray(a);

        System.out.println(arr.sumRange(0, 2));

    }

}