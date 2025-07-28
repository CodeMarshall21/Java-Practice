package com.Q2_Sort.Q1_CyclicSort.Leetcode442;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
//        int [] nums = {4,3,2,7,8,2,3,1};
        int [] nums = {1,1,2};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swapNums(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != (j+1)){
                duplicates.add(nums[j]);
            }
        }

        return duplicates;

    }

    public static void swapNums(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}