package io.ms.leetcodechallenges.february2022;

import java.util.Arrays;

public class K_DiffPairs_532 {


    public static void main(String[] args) {

        int[] nums = {3,1,4,1,5};

        int k =2;

        int result = findPairs(nums,k);

        System.out.println(result);
    }


    public static int findPairs(int[] nums, int k) {


        Arrays.sort(nums);

        int left =0, right =1, result =0;

        while (left < nums.length && right < nums.length){

            if(left  == right  || nums[right] - nums[left] < k){
                right++;
            }else if(nums[right]- nums[left] > k){
                left++;
            }else{
                left++;
                result++;
                while ( left <  nums.length && nums[left] == nums[left-1]){
                    left++;
                }
            }
        }
        return result;
    }
}
