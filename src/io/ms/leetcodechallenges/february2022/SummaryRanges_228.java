package io.ms.leetcodechallenges.february2022;

import java.util.*;

public class SummaryRanges_228 {

    public static void main(String[] args) {

        int[] nums = {0,1,2,4,5,7};

        List<String> result = summaryRanges(nums);

        for(String current:result){
            System.out.print(current +"    ");
        }

    }


    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        if(nums == null || nums.length ==0){
            return result;
        }

        int start=0;
        int i =0;

        for(;start < nums.length && i <nums.length;){
            if(i <  nums.length-1 && nums[i]+1 == nums[i+1]){
                i++;
            }else{
                String subAnswer = "";

                if(start == i){
                    subAnswer += nums[start];
                }else{
                    subAnswer = nums[start] +"->"+nums[i];
                }
                result.add(subAnswer);
                start = i+1;
                i++;
            }
        }

return result;

    }
}
