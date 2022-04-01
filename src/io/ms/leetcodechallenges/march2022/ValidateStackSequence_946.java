package io.ms.leetcodechallenges.march2022;

import java.util.Stack;

public class ValidateStackSequence_946 {

    public static void main(String[] args) {

        int[] pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};

        boolean result = validateStackSequences(pushed,popped);

        System.out.println(result);
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> st= new Stack<>();
        int s = 0;
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.empty() && popped[s] ==st.peek()){
                st.pop();
                s++;
            }
        }
        return st.empty();
    }
}
