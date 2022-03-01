//package io.ms.leetcodechallenges.february2022;
//
//import java.util.*;
//
//public class CloneGraph_133 {
//
//    static class Node {
//        public int val;
//        public List<Node> neighbors;
//        public Node() {
//            val = 0;
//            neighbors = new ArrayList<Node>();
//        }
//        public Node(int _val) {
//            val = _val;
//            neighbors = new ArrayList<Node>();
//        }
//        public Node(int _val, ArrayList<Node> _neighbors) {
//            val = _val;
//            neighbors = _neighbors;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int V=4;
//
//        ArrayList<ArrayList<Integer>> adjacencyList= new ArrayList<ArrayList<Integer>>(V);
//
//        for(int i=0;i<V;i++){
//            adjacencyList.add(new ArrayList<Integer>());
//        }
//
//        addEdge(adjacencyList,)
//    }
//
//    public Node cloneGraph(Node node) {
//
//        if(node == null) {
//            return null;
//        }
//
//        Node[] visited = new Node[1000];
//        Node copy = new Node(node.val);
//        visited[node.val]= copy;
//
//        for(Node current: node.neighbors){
//
//              if(visited[current.val] == null){
//                  Node newNode =new Node(current.val);
//                  copy.neighbors
//              }
//
//        }
//    }
//}
