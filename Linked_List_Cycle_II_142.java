import java.util.*;

public class Linked_List_Cycle_II_142 {
    
    public static void main(String args[]) {
        int[] keys = {-1,-7,7,-4,19,6,-9,-5,-2,-5};
 
        ListNode head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new ListNode(keys[i], head);
        }
        head.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next.next;

        System.out.println(detectCycle(head));
    }


    public static ListNode detectCycle(ListNode head) {
        ListNode current = head;
        Set<ListNode> set = new HashSet<>();
    
        while (current != null)
        {
            if(set.contains(current)){
                System.out.println("Loop = "+current.val);
                return current;
            }
            
            set.add(current);
            current = current.next;
        }
 
    
        return null;
    }

}
