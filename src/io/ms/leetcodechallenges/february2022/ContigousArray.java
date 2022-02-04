package io.ms.leetcodechallenges.february2022;

import java.util.HashMap;
import java.util.Map;

public class ContigousArray {

    public static void main(String[] args) {

        int[] nums = {0,1,0};

        int result = findMaxLength(nums);

        System.out.println(result);

    }

    public static int findMaxLength(int[] nums) {

        if(nums == null || nums.length ==0 ){
            return 0;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefix =0;
        int maxLength =0;
        for(int i=0;i<nums.length;i++){

            prefix = prefix + nums[i];

            if(map.containsKey(prefix)){
                if(maxLength<i-map.get(prefix)){
                    maxLength = i -map.get(prefix);
                }
            }

            map.putIfAbsent(prefix,i);
        }

        return maxLength;

    }
}
