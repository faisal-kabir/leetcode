public class Merge_Two_Sorted_Lists_21 {
    public static void main(String args[]) {
        System.out.println(mergeTwoLists(new ListNode(1,new ListNode(2,new ListNode(4))),new ListNode(1,new ListNode(3,new ListNode(4)))));
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null){
            return list1;
        } else if (list1 == null){
            return list2;
        } else if(list2 == null){
            return list1;
        }

        ListNode margeList = list1;
        while(list1!=null){
            //System.out.println("Current <= "+(current.val <= list2.val));
            //System.out.println("Current Next >= "+((current.next !=null ? current.next.val >= list2.val : false)));
            if(list1.val <= list2.val && (list1.next !=null ? list1.next.val >= list2.val : false)){
                //list1.next = new ListNode(list2.val,list1.next);
                margeList.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                margeList.next = new ListNode(list1.val);
            }
            if(list1.next==null && list2!=null){
                list1.next = list2;
            }
            System.out.println(margeList.val);
            list1 = list1.next;
        }

        return margeList;
    }

}
