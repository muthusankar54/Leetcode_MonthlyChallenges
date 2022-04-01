package io.ms.leetcodechallenges.march2022;

import java.util.Stack;

public class ScoreOfParenthesis_856 {


    public static void main(String[] args) {

        String s = "(()(()))";

        int result = scoreOfParentheses(s);

        System.out.println(result);

    }

    public static int scoreOfParentheses(String s) {
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for(char c : s.toCharArray()) {
            int val = 0;
            if(c=='(') st.push(0);
            else {
                //Calculate the score
                while(st.peek() != 0) val+=st.pop();
                val = Math.max(2*val,1);   //() gives 1
                st.pop();
                st.push(val);
            }
        }
        while(!st.isEmpty()) count+=st.pop();
        return count;
    }
}
