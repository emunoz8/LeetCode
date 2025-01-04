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
        ListNode a = createList(1, 3);
        ListNode b = createList(6, 10);

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
        if (start == 1) {
            ListNode a = new ListNode(100);
            pointer.next = a;
            pointer = a;

            ListNode b = new ListNode(110);
            pointer.next = b;
            pointer = b;

        }

        return head;

    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode start;
        ListNode p = new ListNode();
        start = p;

        while (a != null && b != null) {
            if (a.val < b.val) {
                p.next = a;
                a = a.next;
                p = p.next;

            } else {
                p.next = b;
                b = b.next;
                p = p.next;

            }

        }
        if (a != null)
            p.next = a;
        else
            p.next = b;

        return start.next;
    }

}