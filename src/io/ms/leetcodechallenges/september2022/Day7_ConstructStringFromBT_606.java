package io.ms.leetcodechallenges.september2022;

public class Day7_ConstructStringFromBT_606 {

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
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        String result = tree2str(root);

        System.out.println(result);

    }


    public static String tree2str(TreeNode root) {

        if(root == null){
            return "";
        }
        if(root.left == null &&  root.right == null){
            return root.val+"";
        }
        if(root.right == null){
            return root.val+"("+tree2str(root.left)+")";
        }
        return root.val+"("+tree2str(root.left)+")("+tree2str(root.right)+")";
    }
}
