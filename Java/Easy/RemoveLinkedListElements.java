public class RemoveLinkedListElements {

    public static void main(String[] args) {

        ListNode head = new ListNode(7);
        ListNode a = head;

        for (int i = 0; i < 5; i++) {
            ListNode b = new ListNode(7);
            a.next = b;
            a = b;
        }

        ListNode node = removeElements(head, 7);

        while (node != null) {
            System.out.println(node);
            node = node.next;
        }

    }

    //LeetCode answer
    public static ListNode optimalRemoveElements(ListNode head, int val) {
        if (head == null)
            return null;

        head.next = removeElements(head.next, val);

        if (head.val == val)
            return head.next;

        return head;
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        ListNode prev = new ListNode();
        ListNode node;
        prev.next = head;
        node = prev;

        while (node.next != null) {
            if (node.next.val == val)
                node.next = node.next.next;
            else
                node = node.next;

        }

        return prev.next;

    }
}