
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode c = new TreeNode(3, null, null);
        TreeNode b = new TreeNode(2, c, null);
        TreeNode a = new TreeNode(1, null, b);

        List<Integer> ans = inorderTraversal(a);

        for (Integer n : ans) {
            System.out.print(n + " ");
        }

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();

        if (root != null)
            helper(root, inorder);

        return inorder;
    }

    public static void helper(TreeNode root, List<Integer> inorder) {

        if (root.left != null)
            helper(root.left, inorder);

        inorder.add(root.val);

        if (root.right != null)
            helper(root.right, inorder);

    }

}