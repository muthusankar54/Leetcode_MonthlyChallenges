package io.ms.leetcodechallenges.february2022;

import java.util.*;

public class SubSets_78 {


    public static void main(String[] args) {

        int[] nums = {1,2,3};

        List<List<Integer>> result = subsets(nums);

        result.stream().forEach((x) -> x.stream().forEach(System.out::print));


    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if(nums == null || nums.length ==0){
            return result;
        }

        result.add(new ArrayList<>());
        helper(nums,result,new ArrayList<Integer>(),0);

        return result;
    }

    private static void helper(int[] nums, List<List<Integer>> result, ArrayList<Integer> currentList, int index) {

        if(index >= nums.length){
            return;
        }else{
            for(int i=index;i<nums.length;i++){
                currentList.add(nums[i]);
                result.add(new ArrayList<>(currentList));
                helper(nums,result,currentList,i+1);
                currentList.remove(currentList.size()-1);
            }
        }

    }
}
