package io.ms.leetcodechallenges.march2022;

public class MergeTwoSortedList_21 {


     public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {

         ListNode list1Head = new ListNode(1);
         list1Head.next = new ListNode(2);
         list1Head.next.next = new ListNode(4);


        ListNode list2Head = new ListNode(1);
        list2Head.next = new ListNode(3);
        list2Head.next.next  = new ListNode(4);

        ListNode result = mergeTwoLists(list1Head,list2Head);


        while (result!=null){
            System.out.print(result.val+"    ");
            result = result.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {


         ListNode dummyHead = new ListNode(-1);

         if(list1== null){
             return list2;
         }


         if(list2 == null){
             return list1;
         }


         ListNode first = list1;
         ListNode second = list2;

         ListNode result = dummyHead;


         while (first!= null && second!=null){

             if(first.val <= second.val){
                 result.next = first;
                 first = first.next;
                 result = result.next;
             }else{
                 result.next = second;
                 second = second.next;
                 result = result.next;

             }
         }


         while (first !=null){
             result.next = first;
             first = first.next;
             result = result.next;
         }

         while (second != null){
             result.next = second;
             second = second.next;
             result = result.next;
         }

         return dummyHead.next;
    }
}
