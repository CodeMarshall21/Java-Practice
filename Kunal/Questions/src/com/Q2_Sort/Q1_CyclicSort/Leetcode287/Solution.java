package com.Q2_Sort.Q1_CyclicSort.Leetcode287;

class Solution {
    public static void main(String[] args) {

    }
    static int findDuplicate(int[] nums) {
        int i = 0;

        while(i < nums.length){
            if(nums[i] != i + 1){                   //   if correct number not in the correct place by default
                int correctIndex = nums[i] - 1;     //   You're calculating where the current number actually belongs.
                if(nums[i] != nums[correctIndex]){  //   Is the number at index i already at its correct position?
                    swapNum(nums,i, correctIndex);  //   Swap the current number with the one at its correct spot.
                }
                else{
                    return nums[i];                 // So you checked that the number currently in its position is not the right place using "if(nums[i] != i + 1)"
                                                    // And you check whether number at index i is where it suppose to be using "if(nums[i] != nums[correctIndex])"
                                                    // But the second condition you check tends to be false !!
                                                    // How an element can both be at the wrong and right place at the same time ??
                                                    // This proved that the element is DUPLICATE whose duplicate is at the both places at the same time
                                                    // This needs to be returned !!
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