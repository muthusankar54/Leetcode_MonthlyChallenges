//package io.ms.leetcodechallenges.August2022;
//
//public class Day10_ConvertSortedArray2BST_108 {
//
//    public static class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
//
//    public static void main(String[] args) {
//       int [] nums = {-10,-3,0,5,9};
//
//       TreeNode result = sortedArrayToBST(nums);
//
//        displayTreeInOrder(result);
//    }
//
//    private static void displayTreeInOrder(TreeNode result) {
//
//        displayTreeInOrder(result.left);
//
//        System.out.print(result.val+"     ");
//
//        displayTreeInOrder(result.right);
//    }
//
//
//    public static TreeNode sortedArrayToBST(int[] nums) {
//
//
//        TreeNode result  = new TreeNode();
//
//        if(nums == null || nums.length ==0){
//            return result;
//        }
//
//        return helper(nums,0,nums.length-1);
//    }
//
//    private static TreeNode helper(int[] nums, int i, int j) {
//
//        if(i>j){
//            return null;
//        }
//
//        int mid = (i + j) / 2;
//        TreeNode newNode = new TreeNode(nums[mid]);
//        newNode.left = helper(nums, i, mid-1);
//        newNode.right = helper(nums,mid+1,j);
//
//        return newNode;
//    }
//}
