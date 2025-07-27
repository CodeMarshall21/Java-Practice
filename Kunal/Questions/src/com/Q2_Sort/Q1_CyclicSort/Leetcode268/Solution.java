package com.Q2_Sort.Q1_CyclicSort.Leetcode268;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int missingNum = missingNumber(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(missingNum);
    }
    static int missingNumber(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    static void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            if (nums[i] < nums.length && nums[i] != i){
                swapNums(nums, nums[i], i);
            }
            else{
                i++;
                continue;
            }
        }
    }

    static void swapNums(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
