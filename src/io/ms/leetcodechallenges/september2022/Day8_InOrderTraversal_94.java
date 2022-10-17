package io.ms.leetcodechallenges.september2022;

import java.util.ArrayList;
import java.util.List;

public class Day8_InOrderTraversal_94 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = inorderTraversal(root);

        for(int res : result){
            System.out.print(res+"   ");
        }
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }

    private static void helper(TreeNode root,List<Integer> result){
        if(root != null){
            helper(root.left, result);
            result.add(root.val);
            helper(root.right,result);
        }
    }
}
