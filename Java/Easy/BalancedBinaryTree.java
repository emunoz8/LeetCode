public class BalancedBinaryTree {

    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {

        return helper(root) != -1;
    }

    public static int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left, right;

        left = helper(root.left);
        right = helper(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }
}