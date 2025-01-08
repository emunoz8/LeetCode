import java.util.ArrayList;

public class SymmetricTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    // optimal recursive

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    // not optimal solution
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        ArrayList<TreeNode> a = new ArrayList<>();
        ArrayList<TreeNode> b = new ArrayList<>();
        TreeNode l;
        TreeNode r;

        a.add(root.left);
        b.add(root.right);

        while (!a.isEmpty() && !b.isEmpty()) {
            l = a.remove(0);
            r = b.remove(0);

            if (l == null && r == null)
                continue;
            if (l == null || r == null || l.val != r.val)
                return false;

            a.add(l.left);
            a.add(l.right);
            b.add(r.right);
            b.add(r.left);
        }

        return a.isEmpty() && b.isEmpty();

    }

}