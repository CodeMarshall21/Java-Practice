package com.Q2_Sort.Q1_CyclicSort.Leetcode41;

class Solution {
    public static void main(String[] args) {
        int [] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swapNums(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length;
    }

    static void swapNums(int[] nums, int i, int correctIndex){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}