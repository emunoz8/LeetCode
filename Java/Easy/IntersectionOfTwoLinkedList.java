import java.util.ArrayList;

public class IntersectionOfTwoLinkedList{

    //LeetCode solution
    public ListNode optimalGetIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = len(headA);//recursive call to get size
        int lenB = len(headB);

        //compares which list is larger
        if(lenA > lenB)
            headA = moveHead(headA, lenA - lenB);
                   
        else if(lenA < lenB)
            headB = moveHead(headB, lenB - lenA);
        
        return compare(headA, headB);
    }

    private int len(ListNode node){
        if(node == null) 
            return 0;
        else 
            return 1 + len(node.next);
    }
    //moves the head of the longer list, to make it same size as shorter list
    private ListNode moveHead(ListNode node, int count){
        for(int i = 0; i < count; i++)
            node = node.next;
        return node;
    }

    private ListNode compare(ListNode nodeA, ListNode nodeB){
        if(nodeA==null || nodeB==null) 
            return null;
        if(nodeA==nodeB) 
            return nodeA;
        return compare(nodeA.next, nodeB.next);
    }

    //first solution, not optimal
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> visited = new ArrayList<>();
        ListNode a = headA;
        ListNode b = headB;

        while(a != null){
            visited.add(a);
            a = a.next;
        }
        
        while(b != null){
            if(visited.contains(b))
                return b;
            b = b.next;
        }

        return null;

    }

}