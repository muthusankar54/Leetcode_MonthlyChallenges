package io.ms.leetcodechallenges.february2022;

import java.util.*;

public class Remove_K_Digits_402 {


    public static void main(String[] args) {

        String digits = "10200";
        int k =1;
        String result = removeKdigits(digits,k);

        System.out.println(result);

    }


    public static String removeKdigits(String num, int k) {

        int n = num.length();

        Stack<Character> currentStack = new Stack<>();

        for(char c: num.toCharArray()){

            while (!currentStack.isEmpty() && k >0 && currentStack.peek()>c){

                currentStack.pop();
                k -= 1;
            }

            currentStack.push(c);
        }

        while (!currentStack.isEmpty() && k> 0){
            currentStack.pop();
            k--;

            if(currentStack.isEmpty()){
                return "0";
            }
        }

        String ans = "";

        while (!currentStack.isEmpty()){
            ans = currentStack.pop() + ans;
        }

        ans = ans + num.substring(n);

        int i=0;

        while (i<ans.length()){
            if(ans.charAt(i) == '0'){
                i++;
            }else{
                break;
            }
        }
        return num.substring(i).length() ==0 ? "0" : ans.substring(i);

    }
}
