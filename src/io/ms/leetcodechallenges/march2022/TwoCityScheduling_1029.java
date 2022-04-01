package io.ms.leetcodechallenges.march2022;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling_1029 {


    public static void main(String[] args) {

        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};

        int result = twoCitySchedCost(costs);

        System.out.println(result);
    }


    public static int twoCitySchedCost(int[][] costs) {

        int n = costs.length;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[1] - (o2[0] - o2[1]);
            }
        });

        int ans =0;

        for(int i=0;i<n;i++){
            ans += i>=n/2?costs[i][1]:costs[i][0];
        }

        return ans;

    }

}
