package io.ms.leetcodechallenges.march2022;

public class IsSubSequence_392 {

    public static void main(String[] args) {
       String s = "abc", t = "ahbgdc";

       boolean result = isSubsequence(s,t);

        System.out.println(result);

    }

    public static boolean isSubsequence(String s, String t) {

        if( (s == null || s.length() ==0 ) || (t == null || t.length() ==0 )){
            return false;
        }

        int i= 0;
        int j = 0;


        while (i< s.length() && j < t.length()){

            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            j++;
        }

        return i==s.length();

    }
}
