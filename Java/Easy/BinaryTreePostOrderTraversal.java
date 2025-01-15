import java.util.List;
import java.util.ArrayList;

public class BinaryTreePostOrderTraversal {
    //left, right, root
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        helper(root, list);
        return list;

    }

    public static void helper(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        helper(node.left, list);
        helper(node.right, list);
        list.add(node.val);

    }

}