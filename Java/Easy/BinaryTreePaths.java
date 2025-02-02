import java.util.List;
import java.util.ArrayList;

public class BinaryTreePaths {

    List<String> ans;//global

    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        this.ans = new ArrayList<>();
        findNodeAllPath(root, new StringBuilder());
        return ans;
    }

    private void findNodeAllPath(TreeNode root, StringBuilder sb) {
        if (root == null)
            return;

        if (sb.length() != 0) {
            sb.append("->");
        }
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            ans.add(sb.toString());
        }

        findNodeAllPath(root.left, new StringBuilder(sb));
        findNodeAllPath(root.right, new StringBuilder(sb));
    }

    //optimal LeetCode answer
    //This solutino utilizes stringBuilder, which is faster than dealing with strings.

    /*
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root != null)
            helper(list, root, "");
    
        return list;
    
    }
    
    public static void helper(List<String> list, TreeNode node, String route) {
        if(node.left == null && node.right== null)
            list.add(route + node.val);
        
        if(node.left != null)
            helper(list, node.left, route + node.val +"->");
        
        if(node.right != null)
            helper(list, node.right, route + node.val + "->");
    
    
    }
            List<String> list = new ArrayList<>();
        if(root != null)
            helper(list, root, "");
    
        return list;
    
    }
    
    public static void helper(List<String> list, TreeNode node, String route) {
        if(node.left == null && node.right== null)
            list.add(route + node.val);
        
        if(node.left != null)
            helper(list, node.left, route + node.val +"->");
        
        if(node.right != null)
            helper(list, node.right, route + node.val + "->");
    
    
    }
    */

}