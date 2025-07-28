package com.Q2_Sort.Q1_CyclicSort.Leetcode448;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swapNums(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }

        List<Integer> missingNums= new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != (j+1)){
                missingNums.add(j+1);
            }
        }

        return missingNums;
    }

    static void swapNums(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}