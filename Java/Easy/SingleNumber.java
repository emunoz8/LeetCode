public class SingleNumber {

    public static void main(String[] args) {

    }

    //Bitwise XOR operator
    public static int singleNumber(int[] nums) {
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++)
            ans ^= nums[i];

        return ans;

    }

}