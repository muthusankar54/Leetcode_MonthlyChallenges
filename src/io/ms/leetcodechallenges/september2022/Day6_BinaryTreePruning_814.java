package io.ms.leetcodechallenges.september2022;

public class Day6_BinaryTreePruning_814 {

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
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        TreeNode result = pruneTree(root);



    }


    public static  TreeNode pruneTree(TreeNode root) {

        if(root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(canDeleteNode(root)){
            return null;
        }

        return root;
    }

    private static boolean canDeleteNode(TreeNode root) {
        if(root.left == null && root.right == null && root.val ==0){
            return true;
        }else{
            return false;
        }
    }
}
