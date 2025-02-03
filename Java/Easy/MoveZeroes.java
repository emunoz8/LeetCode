public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = { 0, 1 };

        moveZeroes(nums);

        for (int num : nums)
            System.out.print(num + " ");

    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = i + 1, temp;
        int zeroes = 0;
        int split;

        for (int k = 0; k < n; k++)
            if (nums[k] == 0)
                zeroes++;

        split = n - zeroes;

        while (i < split) {

            while (nums[i] != 0) {
                i++;
                j++;
            }

            while (nums[j] == 0)
                j++;

            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }
}