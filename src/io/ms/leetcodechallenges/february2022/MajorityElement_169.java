package io.ms.leetcodechallenges.february2022;

import java.util.*;

public class MajorityElement_169 {


    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        int result = majorityElement(nums);

        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {

        int result =0;
        if(nums == null || nums.length ==0 ){
            return result;
        }
        int floorValue = nums.length /2;
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(frequencyMap.get(nums[i]) > floorValue){
                result = nums[i];
                return result;
            }
        }

        return result;

    }
}
