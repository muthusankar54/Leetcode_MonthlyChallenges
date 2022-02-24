package io.ms.leetcodechallenges.february2022;

import java.util.*;

public class ExcelSheetColumnNumer_171 {

    public static void main(String[] args) {

        String columnTitle = "FXSHRXW";

        int result = titleToNumber(columnTitle);

        System.out.println(result);
    }

    public static  int titleToNumber(String columnTitle) {

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        map.put('D',4);
        map.put('E',5);
        map.put('F',6);
        map.put('G',7);
        map.put('H',8);
        map.put('I',9);
        map.put('J',10);
        map.put('K',11);
        map.put('L',12);
        map.put('M',13);
        map.put('N',14);
        map.put('O',15);
        map.put('P',16);;
        map.put('Q',17);
        map.put('R',18);
        map.put('S',19);
        map.put('T',20);
        map.put('U',21);
        map.put('V',22);
        map.put('W',23);
        map.put('X',24);
        map.put('Y',25);
        map.put('Z',26);

        int ans =0;
        int fact = 1;


        for(int i=columnTitle.length()-1;i>=0;i--){
            ans += fact * (map.get(columnTitle.charAt(i)));
            fact = fact * 26;
        }

        return ans;

    }
}
