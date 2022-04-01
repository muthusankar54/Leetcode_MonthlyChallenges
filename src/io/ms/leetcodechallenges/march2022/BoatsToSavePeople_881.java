package io.ms.leetcodechallenges.march2022;

import java.util.Arrays;

public class BoatsToSavePeople_881 {


    public static void main(String[] args) {

        int[] people = {3,5,3,4};

       int limit = 5;

       int result = numRescueBoats(people,limit);

        System.out.println(result);

    }


    public static int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int start =0;
        int end = people.length-1;
        int boatCount =0;
        while (end >= start){
            if(people[end]==limit){
                end--;
                boatCount++;
            } else if(people[end]+ people[start] <=limit){
                start++;
                end--;
                boatCount++;
            } else {
                end--;
                boatCount++;
            }
        }

        return boatCount;
    }
}
