package io.ms.leetcodechallenges.june2022;

public class Day25_FindFirstLastPosition_34 {


    public static void main(String[] args) {

       int [] nums = {5,7,7,8,8,10};
       int target = 8;

       int[] result = searchRange(nums,target);

       for(int i: result) {
           System.out.print(i + "   ");
       }

    }

    public  static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0 || nums == null)
            return new int[]{-1,-1};

        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        int end = left - 1;
        if (end == -1 || nums[end] != target)
            return new int[]{-1,-1};

        left = 0; right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }
        return new int[]{left, end};
    }
}
