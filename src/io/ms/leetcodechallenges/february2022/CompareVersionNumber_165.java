package io.ms.leetcodechallenges.february2022;

public class CompareVersionNumber_165 {


    public static void main(String[] args) {

        String version1 = "1", version2 = "1.1";

        int result = compareVersion(version1,version2);

        System.out.println(result);
    }

    public static int compareVersion(String version1, String version2) {

        String[] v1SplittedCharacters = version1.split("\\.");

        String[] v2SplittedCharacters = version2.split("\\.");

        int first =0;
        int second  =0;

        int v1Length = v1SplittedCharacters.length;
        int v2Length = v2SplittedCharacters.length;

        while (first < v1Length && second < v2Length){

            int value1 = Integer.parseInt(v1SplittedCharacters[first]);
            int value2 = Integer.parseInt(v2SplittedCharacters[second]);
            first++;
            second++;

            if(value1 > value2){
                return 1;
            }else if( value1 < value2){
                return -1;
            }else{
                continue;
            }
        }


        while (first < v1Length){

            int value1 = Integer.parseInt(v1SplittedCharacters[first]);

            first++;

            if(value1 > 0){
                return 1;
            }
        }


        while (second < v2Length){

            int value2 = Integer.parseInt(v2SplittedCharacters[second]);

            second++;

            if(value2 > 0){
                return -1;
            }
        }

       return 0;

    }
}
