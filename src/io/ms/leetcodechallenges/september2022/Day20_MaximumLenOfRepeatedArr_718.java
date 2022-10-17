package io.ms.leetcodechallenges.september2022;

public class Day20_MaximumLenOfRepeatedArr_718 {

    public static void main(String[] args) {

        int [] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};

        int result = findLength(nums1, nums2);

        System.out.println(result);
    }


    public static int findLength(int[] nums1, int[] nums2) {

        int max =0;

        int[][] dp = new int[nums1.length+1][nums2.length+1];

        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<nums2.length;j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max = Math.max(dp[i][j],max);
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return max;

    }
}
