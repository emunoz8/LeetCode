public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {

    }

    public static TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums, 0, nums.length - 1);

    }

    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, left, mid - 1);// first iteration did not had mid as the third argument, not mid-1
        root.right = helper(nums, mid + 1, right);

        return root;
    }
}