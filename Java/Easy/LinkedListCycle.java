import java.util.ArrayList;

public class LinkedListCycle {

    public static void main(String[] args) {

    }

    public boolean optimalHasCycle(ListNode head){
        if( head==null|| head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
         if(fast==slow){
            return true;
        }
        }
       return false;

    }

    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        if(head == null)
            return false;

        do{
            if(!list.contains(head))
                list.add(head);
            else
                return true;

            head = head.next;

        }while(head != null);


        return false;
        
    }

    // public static ListNode detectCycles(ListNode head) {
    //     ArrayList<ListNode> list = new ArrayList<>();
    //     list.add(head);

    //     while (head != null) {
    //         if (!list.contains(head))
    //             list.add(head);
    //         else
    //             return true;

    //         head = head.next;

    //     }

    //     return null;
    // }

}