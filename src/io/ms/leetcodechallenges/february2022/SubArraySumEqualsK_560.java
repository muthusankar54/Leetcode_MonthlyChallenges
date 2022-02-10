package io.ms.leetcodechallenges.february2022;

import java.util.*;

public class SubArraySumEqualsK_560 {

    public static void main(String[] args) {

        int[] nums = {3,4,7,2,-3,1,4,2};

        int k =7;

        int result = subarraySum(nums,k);

        System.out.println(result);
    }

    public static int subarraySum(int[] nums, int k) {

        if(nums == null || nums.length ==0){
            return 0;
        }

        Map<Integer,Integer> currentSumMap = new HashMap<Integer,Integer>();

        int count  =0;
        int sum =0;
        currentSumMap.put(0,1);

        for(int i=0;i<nums.length;i++){

            sum += nums[i];

            if(currentSumMap.containsKey(sum-k)){
                count += currentSumMap.get(sum-k);
            }
            currentSumMap.put(sum,currentSumMap.getOrDefault(sum,0)+1);
        }

        return count;

    }
}
