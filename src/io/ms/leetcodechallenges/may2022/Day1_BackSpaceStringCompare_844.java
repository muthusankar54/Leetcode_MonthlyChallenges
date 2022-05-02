package io.ms.leetcodechallenges.may2022;

import java.util.Stack;

public class Day1_BackSpaceStringCompare_844 {


    public static void main(String[] args) {

        String s = "a##c", t = "#a#c";

        boolean result = backspaceCompare(s,t);

        System.out.println(result);
    }


    public static boolean backspaceCompare(String s, String t) {

        if( (s== null || s.length() ==0) && ( t == null && t.length()==0)){
            return false;
        }

        return build(s).equals(build(t));
    }

    private static String  build(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        return String.valueOf(stack);
    }
}
