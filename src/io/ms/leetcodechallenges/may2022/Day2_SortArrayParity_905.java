package io.ms.leetcodechallenges.may2022;

public class Day2_SortArrayParity_905 {

    public static void main(String[] args) {

        int[] nums = {3,1,2,4};

        int[] result = sortArrayByParity(nums);

        System.out.println("Final result :");
        for (int i : result){
            System.out.print(i + "   ");
        }

    }

    public static int[] sortArrayByParity(int[] nums) {

        if(nums == null || nums.length ==0){
            return nums;
        }

        int first = 0;
        int last = nums.length-1;

        while(first<last){

            if(nums[first] % 2 > nums[last] %2){
                int temp = nums[first];
                nums[first]= nums[last];
                nums[last]= temp;
            }

            if(nums[first] %2 ==0){
                first++;
            }

            if(nums[last] %2 ==1 ){
                last--;
            }
        }

        return nums;
    }
}
