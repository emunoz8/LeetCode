package RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2 };
        int k = RemoveDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int RemoveDuplicates(int[] nums) {
        int k = 0;
        int cNum = nums[0];
        int n = nums.length;
        boolean isDone = false;

        for (int i = 1; i < n && !isDone; i++) {
            while (i + k < n && cNum == nums[i + k]) {
                if (i + ++k >= n)
                    isDone = true;
            }
            if (!isDone) {
                nums[i] = nums[i + k];
                cNum = nums[i];
            }
        }

        return n - k;
    }

}