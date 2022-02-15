package io.ms.leetcodechallenges.february2022;

import java.util.*;


public class SingleNumber_136 {


    public static void main(String[] args) {

        int[] nums = {2,2,1};

        int result = singleNumber(nums);

        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();



        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){

            if(map.get(nums[i])==1){
                return nums[i];
            }
        }

        return 0;
    }
}
