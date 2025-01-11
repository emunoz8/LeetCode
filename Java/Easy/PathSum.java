public class PathSum {

    public static void main(String[] args) {

    }

    //better implemintation 
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return helper(root, targetSum);
    }

    public static boolean helper(TreeNode node, int target) {
        if (node == null)
            return false;

        if (node.left == null && node.right == null)
            return node.val == target;
        return helper(node.left, target - node.val) || helper(node.right, target - node.val);

    }
    /*
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
    
        return helper(root, root.val, targetSum);
    }
    
    public static boolean helper(TreeNode root, int sum, int target) {
        if (root == null)
            return false;
    
        if (root.left == null && root.right == null && sum == target)
            return true;
        if (root.left != null && helper(root.left, sum + root.left.val, target))
            return true;
        if (root.right != null && helper(root.right, sum + root.right.val, target))
            return true;
    
        return false;
    }
     */
}