package io.ms.leetcodechallenges.August2022;

import java.util.HashSet;
import java.util.Set;

public class Day17_UniqueMorseCodeWords_804 {


    public static void main(String[] args) {

        String [] words = {"gin","zen","gig","msg"};
        int result = uniqueMorseRepresentations(words);

        System.out.println(result);

    }


    public static int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}
