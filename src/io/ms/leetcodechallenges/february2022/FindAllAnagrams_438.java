package io.ms.leetcodechallenges.february2022;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams_438 {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagrams(s,p);

        for(int index:result){
            System.out.print(index+"   ");
        }
    }

    public static  List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();


        int[] charCount = new int[26];

        for(char c:p.toCharArray()){
            charCount[c - 'a']++;
        }

        int left=0,right =0;
        int count = p.length();

        while (right < s.length()){

            if(charCount[s.charAt(right++)-'a']-- >=1){
                count--;
            }

            if(count ==0){
                result.add(left);
            }

            if(right - left == p.length() && charCount[s.charAt(left++)-'a']++ >=0){
                count++;
            }
        }

        return  result;
    }
}
