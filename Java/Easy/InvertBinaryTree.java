public class InvertBinaryTree {

    public static void main(String[] args) {

    }

    //first try, from my noggin
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        swap(root);
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void swap(TreeNode root) {
        TreeNode temp;

        temp = root.left;
        root.left = root.right;
        root.right = temp;

    }

}