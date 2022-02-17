package io.ms.leetcodechallenges.february2022;

import java.util.*;

public class CombinationSum_39 {

    public static void main(String[] args) {

        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates,target);

        System.out.println(result);

    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>>  ans = new ArrayList<>();

        findCombination(0,candidates,target,ans,new ArrayList<Integer>());

        return ans;

    }

    private static void findCombination(int index, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> current) {


        if(index == candidates.length){

            if( target ==0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }

        if( candidates[index] <= target){
            current.add(candidates[index]);
            findCombination(index,candidates,target-candidates[index],ans,current);
            current.remove(current.size()-1);
        }
        findCombination(index+1,candidates,target,ans,current);
    }
}
