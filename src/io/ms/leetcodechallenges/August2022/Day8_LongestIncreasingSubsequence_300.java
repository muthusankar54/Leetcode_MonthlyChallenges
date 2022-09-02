package io.ms.leetcodechallenges.August2022;

public class Day8_LongestIncreasingSubsequence_300 {


    public static void main(String[] args) {


        int[] nums = {10,9,2,5,3,7,101,18};


        int result = lengthOfLIS(nums);

        System.out.println(result);
    }

    public static int lengthOfLIS(int[] nums) {

        if(nums == null || nums.length ==0){
            return 0;
        }

        return 0;

    }
}
