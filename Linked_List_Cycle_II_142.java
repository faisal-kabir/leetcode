public class Linked_List_Cycle_II_142 {
    
    public static void main(String args[]) {
        System.out.println(detectCycle(new ListNode(3,new ListNode(2,new ListNode(0,new ListNode(-4))))));
    }


    public static ListNode detectCycle(ListNode head) {
        if(head.next == null){
            return head.next;
        }
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        if(count%2 == 0){
            head = head.next;
        }
    
        return head;
    }

}
