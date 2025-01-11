public class BalancedBinaryTree {

    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {

        return helper(root) != -1;
    }

    // does not create unnnecessary variables, returns -1 as soon as is not
    // balanced.
    // DFS
    public static int optimalHelper(TreeNode root) {
        if (root == null)
            return 0;

        int left = optimalHelper(root.left);

        if (left == -1)
            return -1;

        int right = optimalHelper(root.right);

        if (right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }

    // not as optimal
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