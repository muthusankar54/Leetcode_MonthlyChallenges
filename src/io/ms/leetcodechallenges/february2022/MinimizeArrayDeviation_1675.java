package io.ms.leetcodechallenges.february2022;

import java.util.TreeSet;

public class MinimizeArrayDeviation_1675 {

    public static void main(String[] args) {

        int[] nums = {4,1,5,20,3};

        int result = minimumDeviation(nums);

        System.out.println(result);
    }


    public static  int minimumDeviation(int[] nums) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i: nums){
            if(i%2 ==1){
                treeSet.add(i*2);
            }else{
                treeSet.add(i);
            }
        }

        int diff = Integer.MAX_VALUE;

        while (true){
            int maxVal = treeSet.last();
            int minVal = treeSet.first();
            int currentDiff = maxVal - minVal;
            diff = Math.min(currentDiff,diff);
            if(maxVal%2 ==0 ){
                treeSet.remove(maxVal);
                treeSet.add(maxVal/2);
            }else{
                return diff;
            }
        }

    }
}
