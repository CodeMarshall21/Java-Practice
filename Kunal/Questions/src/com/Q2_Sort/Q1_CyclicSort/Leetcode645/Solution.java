package com.Q2_Sort.Q1_CyclicSort.Leetcode645;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
//        int[] ans = new int[2];

        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swapNums(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
//                ans[0] = nums[j];
//                ans[1] = j+1;
//                break;
                return new int[]{nums[j], j+1};
            }
        }
        return new int[]{};
    }

    static void swapNums(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}