package io.ms.leetcodechallenges.August2022;

import java.util.TreeMap;

public class Day3_MyCalendarI_729 {


    static TreeMap<Integer,Integer> map;

    public Day3_MyCalendarI_729() {
      map = new TreeMap<>();
    }

    public static boolean book(int start, int end) {

        Integer prev = map.floorKey(start), next = map.ceilingKey(start);

        if((prev == null || map.get(prev) <= start) && (next == null || end <= start)){
            map.put(start,end);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Day3_MyCalendarI_729 obj = new Day3_MyCalendarI_729();
        boolean param_1 = obj.book(10,20);
        boolean param_2 = obj.book(15,25);

        System.out.println(param_1 + "    "+param_2);

    }


}
