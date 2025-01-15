import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

    //more readable version, LeetCode answer:
    /*
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    
    private void traverse(TreeNode root, List<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
    */
    //root, left, right
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root != null)
            helper(root, list);

        return list;

    }

    public static void helper(TreeNode node, List<Integer> list) {

        list.add(node.val);

        if (node.left != null)
            helper(node.left, list);

        if (node.right != null)
            helper(node.right, list);

    }
}