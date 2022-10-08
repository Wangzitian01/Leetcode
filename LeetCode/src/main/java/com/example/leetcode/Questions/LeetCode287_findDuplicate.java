package com.example.leetcode.Questions;

/**
 * @Author Smith517
 * @Date 2022/8/27 18:52
 * @Version 1.0
 * @Describe TODO
 */
public class LeetCode287_findDuplicate {

    public static void main(String[] args) {
        int nums[] = new int[]{1,3,4,2,2};
        final int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
        Object o = new Object();


    }


    public static int findDuplicate(int []nums){
        int slow=0,fast=0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);
        slow = 0;
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
