public class CountCompleteTreeNodes {

    public static void main(String[] args) {

    }
    //LeetCode Solution
    //reads all the nodes to the left and gets the height of the tree, since tree is complete

    class Solution {
        public int countNodes(TreeNode root) {
            int h = height(root);

            return h < 0 ? 0
                    : height(root.right) == h - 1 ? (1 << h) + countNodes(root.right)
                            : (1 << h - 1) + countNodes(root.left);

            /* ^^ if height is less than zero return zero, this also doubles as a base case the height function will return -1
            
                
            
             
             */

        }

        public int height(TreeNode node) {
            return node == null ? -1 : 1 + height(node.left);//not zero, but negative one because the call adds 1 and if there is no node it shold subtract 1
        }
    }
}