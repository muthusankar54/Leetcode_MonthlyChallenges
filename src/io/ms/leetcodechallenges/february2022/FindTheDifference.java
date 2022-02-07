package io.ms.leetcodechallenges.february2022;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public static void main(String[] args) {

        String s = "a", t="aa";

        char result = findTheDifference(s,t);

        System.out.println(result);


    }

    public static char findTheDifference(String s, String t) {

        char extraCharacter ='\0';


        if(s == null || s.length() ==0){
            return t.charAt(0);
        }

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            int countOfCharacter = map.getOrDefault(ch,0);

            if(countOfCharacter ==0 ){

                extraCharacter = ch;
                break;
            }else{
                map.put(ch,countOfCharacter-1);
            }

        }

        return extraCharacter;
    }
}
