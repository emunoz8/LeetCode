import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }

    //optimal solution, and obvious
    public static boolean optimalIsPalindrome(ListNode head) {
        ListNode point = head;
        int[] nums;
        int n = 0;

        while (point != null) {
            point = point.next;
            n++;
        }

        nums = new int[n - 1];
        point = head;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = point.val;
            point = point.next;
        }

        return true;
    }

    //first attempt
    public static boolean isPalindrome(ListNode head) {
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