package com.Q1_LinearSearch.Leetcode1295;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (isEvenDigits(num)){
                count ++;
            }
        }
        return count;
    }
    static boolean isEvenDigits(int num){
        int digitCount = 0;
        while(num > 0){
            digitCount ++;
            num /= 10;
        }
        return (digitCount & 1) == 0;
    }
}
