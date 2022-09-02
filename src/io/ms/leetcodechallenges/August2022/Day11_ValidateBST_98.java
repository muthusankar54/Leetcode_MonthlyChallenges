//package io.ms.leetcodechallenges.August2022;
//
//public class Day11_ValidateBST_98 {
//
//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        //root = [3,1,5,0,2,4,6]
//
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(0);
//        root.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(6);
//
//         boolean result = isValidBST(root);
//
//        System.out.println(result);
//    }
//
//    public static boolean isValidBST(TreeNode root) {
//
//        return helper(root,null,null);
//
//    }
//
//
//    private static boolean helper(TreeNode node,Integer lower,Integer upper){
//
//        if(node==null){
//            return true;
//        }
//
//        int val = node.val;
//
//        if( lower !=null && val <= lower){
//            return false;
//        }
//
//        if(upper !=null && val >= upper ){
//            return false;
//        }
//
//
//        if(!helper(node.right,val,upper)){
//            return false;
//        }
//
//        if(!helper(node.left,lower,val)){
//            return false;
//        }
//
//        return true;
//
//    }
//}
