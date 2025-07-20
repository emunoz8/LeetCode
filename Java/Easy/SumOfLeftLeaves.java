public class SumOfLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        return valueOfLeft(root.left) + valueOfRight(root.right);

    }

    public static int valueOfLeft(TreeNode node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return node.val;

        return valueOfLeft(node.left) + valueOfRight(node.right);

    }

    public static int valueOfRight(TreeNode node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 0;

        return valueOfLeft(node.left) + valueOfRight(node.right);
    }

}