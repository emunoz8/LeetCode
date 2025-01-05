
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 4, 3 };
        int target = 4;

        int k = removeElement(nums, target);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    // inspiration from removeDuplicates
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val)
                nums[index++] = nums[i];

        return index;
    }

}
