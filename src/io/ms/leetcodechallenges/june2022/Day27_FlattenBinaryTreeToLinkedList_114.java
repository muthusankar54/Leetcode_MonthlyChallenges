package io.ms.leetcodechallenges.june2022;

public class Day27_FlattenBinaryTreeToLinkedList_114 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
        TreeNode(int x,TreeNode left, TreeNode right){
            this.val = x;
            this.left = left;
            this.right = right;

        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        flatten(root);

     }


    public static void flatten(TreeNode root) {

        if( root == null ){
            return;
        }
        flattenTree(root);
    }

    private static TreeNode flattenTree(TreeNode root) {

        if(root  == null)
        {
            return null;
        }

        if(root.left == null && root.right == null){
            return root;
        }

        TreeNode left = flattenTree(root.left);

        TreeNode right = flattenTree(root.right);


        if(left != null){
            left.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return right == null ? left : right;
    }
}
