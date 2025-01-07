/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

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
    };

}

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        // ListNode a = createListWithDuplicates(1, 10);
        ListNode prev = new ListNode(1);
        ListNode next = new ListNode(1, prev);
        ListNode top = new ListNode(1, next);
        // ListNode a = createListWithDuplicates(1, 5);
        ListNode b = deleteDuplicates(top);

        while (b != null) {
            System.out.print(b.val + " ");
            b = b.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode top = head;
        while (head != null) {

            if (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;// bruh
            } else
                head = head.next;
        }

        return top;
    }

    public static ListNode createListWithDuplicates(int start, int stop) {
        ListNode head = new ListNode(start);
        ListNode pointer = new ListNode();
        pointer = head;

        for (int i = start + 1; i <= stop; i++) {
            ListNode a = new ListNode(i);
            ListNode b = new ListNode(i);
            pointer.next = a;
            a.next = b;
            pointer = b;
        }

        return head;

    }

}