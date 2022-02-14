package io.ms.leetcodechallenges.february2022;

public class MaxDepthOfBinaryTree_104 {

    static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){

        }

        TreeNode(int val){
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = maxDepth(root);

        System.out.println(result);
    }


    public static int maxDepth(TreeNode root) {

        int result =0;

        if(root == null){
            return result;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        result = Math.max(left,right)+1;

        return result;

    }
}
