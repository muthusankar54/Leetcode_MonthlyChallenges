package io.ms.leetcodechallenges.August2022;

public class Day22_PowerOfFour_342 {

    public static void main(String[] args) {

        int n =16;

        boolean result  = isPowerOfFour(n);

        System.out.println(result);
    }


    public static boolean isPowerOfFour(int n) {

        if( n == 0){
            return false;
        }

        if( n ==1 ){
            return true;
        }

        while ( n % 4 ==0){

            n /= 4;
        }

        return  n ==1;

    }
}
