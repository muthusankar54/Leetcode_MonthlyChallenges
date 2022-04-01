package io.ms.leetcodechallenges.march2022;

public class FindDuplicateNumber_287_BinarySearch {

    public static void main(String[] args) {

        int[] nums = {3,1,3,4,2};

        int result = findDuplicate(nums);
        System.out.println(result);
    }


    public static int findDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length-1;


        while (low <= high){

            int mid = low + (high - low) /2;


            if(isCountOfElementIsLessThanMid(mid,nums)){

                low = mid +1;
                
            }else{
                high = mid -1;
            }

        }

        return low;

    }

    private static boolean isCountOfElementIsLessThanMid(int mid, int[] nums) {

        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= mid){
                count++;
            }
        }

        return (count<=mid);
    }
}
