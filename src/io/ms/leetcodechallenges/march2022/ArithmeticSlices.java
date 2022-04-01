package io.ms.leetcodechallenges.march2022;

public class ArithmeticSlices {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        int result = numberOfArithmeticSlices(nums);

        System.out.println(result);
    }


    public static int numberOfArithmeticSlices(int[] nums) {

        int[] dp = new int[nums.length];
        int total =0;

        for(int i=2;i<nums.length;i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                dp[i]= dp[i-1]+1;
            }else{
                dp[i] =0;
            }

            total +=dp[i];
        }

        return total;
    }
}
