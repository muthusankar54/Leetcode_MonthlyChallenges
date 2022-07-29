package io.ms.leetcodechallenges.june2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day29_FindAndReplacePattern_890 {


    public static void main(String[] args) {

       String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
       String pattern = "abb";

       List<String> result = findAndReplacePattern(words,pattern);

       for(String word:result){
           System.out.print(word+"    ");
       }
    }


    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        String p = normalize(pattern);

        List<String> result = new ArrayList<>();

        for(String word: words){
            if(p.equals(normalize(word))){
                result.add(word);
            }

        }

        return result;
    }

    private static String normalize(String pattern) {

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        String ans = "";

        for(int i=0;i<pattern.length();i++){
            map.putIfAbsent(pattern.charAt(i),map.size());
            ans += map.get(pattern.charAt(i));
        }

        return ans;
    }
}
