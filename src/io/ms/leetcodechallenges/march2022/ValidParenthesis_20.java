package io.ms.leetcodechallenges.march2022;

import java.util.Stack;

public class ValidParenthesis_20 {


    public static void main(String[] args) {

        String s = "()[]{}";

        boolean result = isValid(s);

        System.out.println(result);
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '(' || s.charAt(i)== '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty() == true){
                    return  false;
                }else if(isMatching(stack.peek(),s.charAt(i)) == false){
                    return  false;
                }else{
                    stack.pop();
                }
            }
        }

        return (stack.isEmpty());

    }

    private static boolean isMatching(Character peek, char charAt) {
        return ( (peek == '(' && charAt == ')') || (peek == '{' && charAt == '}') || (peek == '[' && charAt == ']'));
    }
}
