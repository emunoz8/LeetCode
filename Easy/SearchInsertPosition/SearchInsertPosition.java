package SearchInsertPostion;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int k = searchInsertPosition(nums, 1);
        System.out.println(k);

    }

    // in O(log n),
    public static int searchInsertPosition(int[] nums, int target) {
        int len = nums.length;
        int top = len;
        int mid = 0;
        int i = 0;
        mid = (len + mid) / 2;

        while (i <= (len + 1) / 2) {
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target) {
                mid = top / 2;
                top = mid;
            } else
                mid = (top + mid) / 2;
            i++;
        }

        return mid;
    }
}
