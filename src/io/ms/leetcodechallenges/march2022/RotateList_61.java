package io.ms.leetcodechallenges.march2022;

public class RotateList_61 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k=2;

        ListNode result = rotateRight(head,k);

        while (result!=null){
            System.out.print(result.val + "  ");
            result = result.next;
        }

    }


    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null|| k == 0) return head;

        ListNode cur = head;
        int len = 1;
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }

        cur.next = head;
        k = k % len;
        k = len - k;
        while (k-- > 0) cur = cur.next;
        head = cur.next;
        cur.next = null;


        return head;



    }
}
