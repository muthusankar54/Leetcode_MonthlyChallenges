package io.ms.leetcodechallenges.june2022;

import java.util.List;

public class Day30_WordSubSets_916 {

    public static void main(String[] args) {

        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};

        List<String> result = wordSubsets(words1,words2);

        for(String word : result){
            System.out.print( word+"   ");
        }

    }


    public static List<String> wordSubsets(String[] words1, String[] words2) {

    }
}
