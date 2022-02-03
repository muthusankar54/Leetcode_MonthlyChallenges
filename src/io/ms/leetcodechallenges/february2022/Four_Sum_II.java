package io.ms.leetcodechallenges.february2022;

import java.util.HashMap;
import java.util.Map;

public class Four_Sum_II {

    public static void main(String[] args) {

        int[] nums1 = {1,2}, nums2 = {-2,-1}, nums3 = {-1,2}, nums4 = {0,2};

        int result = fourSumCount(nums1,nums2,nums3,nums4);

        System.out.println(result);

    }


    public static  int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();


        for(int i=0;i<nums1.length;i++){


            for(int j=0;j<nums2.length;j++){

                int sum_AB = nums1[i]+nums2[j];
                map.put(sum_AB,map.getOrDefault(sum_AB,0)+1);
            }
        }

        int ans =0;

        for(int i=0;i<nums3.length;i++){

            for(int j=0;j<nums4.length;j++){
                int sum_CD = nums3[i]+nums4[j];

                int sum_AB = - sum_CD;
                ans += map.getOrDefault(sum_AB,0);
            }
        }

        return  ans;


    }
}
