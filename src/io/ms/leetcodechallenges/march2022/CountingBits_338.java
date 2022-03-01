package io.ms.leetcodechallenges.march2022;

public class CountingBits_338 {


    public static void main(String[] args) {

        int n=5;

        int[] result = countBits(n);

        for(int i: result){
            System.out.print(i+"   ");
        }

    }

    public static int[] countBits(int n) {

        int[] result = new int[n+1];
        result[0] =0;

        for(int i=1;i<=n;++i){
            result[i] = result[i/2] + i%2;
        }

        return result;

    }
}
