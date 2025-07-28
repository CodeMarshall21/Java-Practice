package com.Q2_Sort.Q1_CyclicSort.Leetcode287;

class Solution {
    public static void main(String[] args) {

    }
    static int findDuplicate(int[] nums) {
        int i = 0;

        while(i < nums.length){
            if(nums[i] != i + 1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swapNum(nums,i, correctIndex);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }

        }
        return -1;
    }

    static void swapNum(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}