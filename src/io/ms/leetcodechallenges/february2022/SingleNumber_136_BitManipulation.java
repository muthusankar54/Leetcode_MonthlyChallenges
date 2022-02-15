package io.ms.leetcodechallenges.february2022;


public class SingleNumber_136_BitManipulation {


    public static void main(String[] args) {

        int[] nums = {2,2,1};

        int result = singleNumber(nums);

        System.out.println(result);
    }

    private static int singleNumber(int[] nums) {

        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;

    }

}
