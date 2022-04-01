package io.ms.leetcodechallenges.march2022;

import java.util.*;

public class PartitionLabels_763 {

    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";

        List<Integer> result = partitionLabels(s);

        System.out.println(result);
    }

    public static List<Integer> partitionLabels(String s) {

        List<Integer> ans = new ArrayList<>();

        int[] endIndex = new int[26];

        for(int i=0;i<s.length();i++){
            endIndex[s.charAt(i) - 'a'] = i;

        }

        int index =0;
        while(index<s.length()){
            char startChar = s.charAt(index);
            int terminalIndex = endIndex[startChar-'a'];

            for(int j=0;j<=terminalIndex;j++){
                terminalIndex = Math.max(terminalIndex, endIndex[s.charAt(j)-'a']);
            }

            ans.add(terminalIndex-index+1);
            index = terminalIndex+1;

        }

        return ans;
    }
}
