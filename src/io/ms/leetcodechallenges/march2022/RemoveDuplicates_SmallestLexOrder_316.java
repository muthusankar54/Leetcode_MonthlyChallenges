package io.ms.leetcodechallenges.march2022;

import java.util.*;

public class RemoveDuplicates_SmallestLexOrder_316 {

    public static void main(String[] args) {

        String s = "cbacdcbc";

        String result = removeDuplicateLetters(s);

        System.out.println(result);
    }



    public static String removeDuplicateLetters(String s) {

        if(s == null){
            return null;
        }

        Stack<Character> stack = new Stack<>();

        Set<Character> seenValues = new HashSet<>();

        Map<Character,Integer> lastOccurance = new HashMap<>();

        for(int i=0;i<s.length();i++){
            lastOccurance.put(s.charAt(i),i);
        }

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(!seenValues.contains(c)){

                while(!stack.isEmpty()&& c < stack.peek() && lastOccurance.get(stack.peek())>i){
                    seenValues.remove(stack.pop());
                }
                seenValues.add(c);
                stack.push(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder(stack.size());

        for(Character c: stack){
            stringBuilder.append(c.charValue());
        }


        return stringBuilder.toString();

    }
}
