package io.ms.leetcodechallenges.september2022;

import java.util.Arrays;

public class Day9_NoOfWeakCharactersInGame_1996 {


    public static void main(String[] args) {

        int [][] properties = {
                {5,5},
                {6,3},
                {3,6}
        };

        int result = numberOfWeakCharacters(properties);

        System.out.println(result);
    }


    public static int numberOfWeakCharacters(int[][] properties) {

        int result = 0;


        Arrays.sort(properties, (a,b) -> b[0] == a[0] ? b[1] - a[1] : a[0] - b[0]);

        int maxDefence = Integer.MIN_VALUE;

        for(int i = properties.length-1;i>=0;i--){
            if(properties[i][1] < maxDefence){
                result++;
            }else{
                maxDefence = properties[i][1];
            }
        }

        return result;
    }
}
