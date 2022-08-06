public class Merge_Two_Sorted_Lists_21 {
    public static void main(String args[]) {
        System.out.println(mergeTwoLists(new ListNode(1,new ListNode(2,new ListNode(4,new ListNode(7,new ListNode(8))))),new ListNode(1,new ListNode(3,new ListNode(4,new ListNode(6))))));
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return list1;
        } else if (list1 == null){
            return list2;
        } else if(list2 == null){
            return list1;
        }

        if(list1.val > list2.val){
            ListNode ls = list2;
            list2 = list1;
            list1 = ls;
        }
        ListNode current = list1;
        while(current!=null){
            if(list2!=null && current.val >= list2.val){
                int swap = current.val;
                current.val = list2.val;
                current.next = new ListNode(swap,current.next);
                list2 = list2.next;
            } 
            
            current = current.next;
        }
        if(list2!=null){
            current = list1;
            while(current.next!=null){
                current = current.next;
            }
            current.next = list2;
        }
    
        return list1;
    }

}
