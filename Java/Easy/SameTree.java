import java.util.LinkedList;
import java.util.Queue;

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

public class SameTree {

    public static void main(String[] args) {

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();
        pQueue.add(p);
        qQueue.add(q);

        TreeNode pCurrent;
        TreeNode qCurrent;

        while (!pQueue.isEmpty() && !qQueue.isEmpty()) {
            pCurrent = pQueue.poll();
            qCurrent = qQueue.poll();

            if (pCurrent == null && qCurrent != null || pCurrent != null && qCurrent == null)
                return false;

            if (pCurrent != null && qCurrent != null && pCurrent.val != qCurrent.val)
                return false;

            if (pCurrent != null)
                addLeftCheckRight(pQueue, pCurrent);
            if (qCurrent != null)
                addLeftCheckRight(qQueue, qCurrent);

        }

        if (!pQueue.isEmpty() || !qQueue.isEmpty())
            return false;

        return true;
    }

    public static void addLeftCheckRight(Queue<TreeNode> queue, TreeNode current) {
        if (current.left != null)
            queue.add(current.left);
        else
            queue.add(null);

        if (current.right != null)
            queue.add(current.right);
        else
            queue.add(null);
    }

}