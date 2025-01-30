import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }

    //first attempt
    public static boolean isPalindrom(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        ListNode point = head;

        while (point != null) {
            stack.add(point);
            point = point.next;
        }

        point = head;

        for (int i = 0; i <= stack.size(); i++) {
            if (point.val != stack.pop().val)
                return false;
            point = point.next;

        }

        return true;
    }

}