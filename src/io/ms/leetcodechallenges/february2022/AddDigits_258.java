package io.ms.leetcodechallenges.february2022;

public class AddDigits_258 {

    public static void main(String[] args) {

        int num = 38;

        int result = addDigits(num);

        System.out.println(result);
    }

    public static int addDigits(int num) {

        if(num<=0){
            return num;
        }

        int sum =0, digit;

        while (num >0){

            digit = num% 10;
             sum += digit;
             num /= 10;


             if(num ==0 && sum >9){
                 num = sum;
                 sum =0;
             }
        }

        return  sum;
    }
}
