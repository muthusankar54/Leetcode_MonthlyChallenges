package io.ms.leetcodechallenges.August2022;

public class Day24_PowerOfThree_326 {


    public static void main(String[] args) {

        int n = 27;

        boolean result = isPowerOfThree(n);

        System.out.println(result);

    }

    public static boolean isPowerOfThree(int n) {
        if( n == 0){
            return false;
        }

        if( n ==1 ){
            return true;
        }

        while ( n % 3 ==0){

            n /= 3;
        }

        return  n ==1;
    }
}
