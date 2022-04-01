package io.ms.leetcodechallenges.march2022;

public class FindDuplicateNumber_287_FlyodsApproach {

    public static void main(String[] args) {

        int[] nums = {3,1,3,4,2};

        int result = findDuplicate(nums);
        System.out.println(result);
    }


    public static int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

        fast = nums[0];
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
