/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package MergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode a = createList(1, 5);
        ListNode b = createList(1, 5);

        ListNode c = mergeTwoLists(a, b);

        while (c != null) {
            System.out.print(c.val + " ");
            c = c.next;
        }

    }

    public static ListNode createList(int start, int stop) {
        ListNode head = new ListNode(start);
        ListNode pointer = new ListNode();
        pointer = head;

        for (int i = start + 1; i <= stop; i++) {
            ListNode a = new ListNode(i);
            pointer.next = a;
            pointer = a;
        }

        return head;

    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode start = new ListNode();
        ListNode pointer = new ListNode();
        boolean aIsLonger = true;
        start.next = pointer;

        while (a.next != null && b.next != null) {
            if (a.val < b.val) {
                pointer = a;
                a = a.next;

            } else {
                pointer = b;
                b = b.next;

            }

        }
        if (a.next == null)
            aIsLonger = false;

        if (aIsLonger)
            transferNodes(a, b, start);
        else
            transferNodes(b, a, start);

        return start;
    }

    public static void transferNodes(ListNode left, ListNode right, ListNode c) {
        while (left.next != null) {
            if (left.val > right.val) {
                c.next = left;
                left = left.next;
            } else {
                c.next = right;
                break;
            }

        }
        while (left != null) {
            c.next = left;
            left = left.next;
        }

    }

}