//package io.ms.leetcodechallenges.march2022;
//
//public class CopyListRandomPointer {
//
//    public static class Node {
//        int val;
//        Node next;
//        Node random;
//
//        public Node(int val) {
//            this.val = val;
//            this.next = null;
//            this.random = null;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Node head = new Node(7);
//        head.next = new Node(13);
//        head.next.next = new Node(11);
//        head.next.next.next = new Node(10);
//        head.next.next.next.next = new Node(1);
//        head.next.next.next.next.next = null;
//        head.random = null;
//        head.next.random = head;
//
//        Node result = copyRandomList(head);
//
//        while (result !=null){
//            System.out.print(result.val +"   ");
//            result = result.next;
//        }
//
//    }
//
//    public static   Node copyRandomList(Node head) {
//
//        if(head == null){
//            return null;
//        }
//
//        Node it = head;
//
//        while (it !=null){
//            List
//        }
//
//
//
//    }
//}
