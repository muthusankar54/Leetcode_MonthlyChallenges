package io.ms.leetcodechallenges.march2022;

public class LinkedListCycle_141 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode head= new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);


        head.next.next.next.next = head.next;

        boolean result = hasCycle(head);

        System.out.println(result);

    }

    public static boolean hasCycle(ListNode head) {

        if(head== null){
            return false;
        }

        ListNode first = head;
        ListNode second = head.next;

        while (first != second){

            if(second == null && second.next ==null){
                return false;
            }

                first = first.next;
                second = second.next.next;

        }

        return true;
    }
}
