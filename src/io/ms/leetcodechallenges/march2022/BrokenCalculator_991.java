package io.ms.leetcodechallenges.march2022;

public class BrokenCalculator_991 {

    public static void main(String[] args) {

        int startValue = 2, target = 3;

        int result = brokenCalc(startValue,target);

        System.out.println(result);
    }

    public static int brokenCalc(int startValue, int target) {

        if(startValue >= target)
            return startValue - target;
        if(target % 2 == 0){
            return 1 + brokenCalc(startValue, target / 2);
        }
        return 1 + brokenCalc(startValue, target + 1);
    }
}
