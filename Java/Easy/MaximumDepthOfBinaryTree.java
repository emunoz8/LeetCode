
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

    }

    // got it first try :^)
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}