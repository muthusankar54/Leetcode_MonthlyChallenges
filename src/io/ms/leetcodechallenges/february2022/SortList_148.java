package io.ms.leetcodechallenges.february2022;

public class SortList_148 {


    static public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public static void main(String[] args) {

        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);

        ListNode result = sortList(head);

        while (result !=null){
            System.out.print(result.val + "   ");
            result = result.next;
        }
    }


    public static ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);

        dummyHead.next = head;
        ListNode preInsert;
        ListNode toInsert;

        ListNode current = head;

        while (current !=null && current.next != null){

            if(current.val <= current.next.val){
                current = current.next;
            }else{
                toInsert = current.next;
                preInsert = dummyHead;

                while (preInsert.next.val <= toInsert.val){
                    preInsert = preInsert.next;
                }

                current.next = toInsert.next;
                toInsert.next = preInsert.next;
                preInsert.next = toInsert;

            }
        }

        return dummyHead.next;
    }
}
