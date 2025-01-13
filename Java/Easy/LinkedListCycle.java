import java.util.ArrayList;

public class LinkedListCycle {

    public static void main(String[] args) {

    }

    public static ListNode detectCycles(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);

        while (head != null) {
            if (!list.contains(head))
                list.add(head);
            else
                return head;

            head = head.next;

        }

        return list.getFirst();
    }

}