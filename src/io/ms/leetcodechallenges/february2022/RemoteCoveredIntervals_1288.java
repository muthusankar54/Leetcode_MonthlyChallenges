package io.ms.leetcodechallenges.february2022;

import java.util.Arrays;

public class RemoteCoveredIntervals_1288 {


    public static void main(String[] args) {

        int[][] intervals = { {1,4},{3,6},{2,8}};

        int result = removeCoveredIntervals(intervals);

        System.out.println(result);

    }


    public static int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> a[0] -b[0]);

        int[] current = new int[]{-1,-1};
        int result =0;

        for(int[] in:intervals){

            if(in[0] > current[0] && in[1] > current[1]){
                current[0] = in[0];
                result++;
            }
            current[1] = Math.max(current[1],in[1]);
        }
     return  result;
    }
}
