package com.Q1_Search.Q1_LinearSearch.Leetcode1672;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){
            int wealthSum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                wealthSum += accounts[person][account];
            }
            if(wealthSum > maxWealth){
                maxWealth = wealthSum;
            }
        }
        return maxWealth;
    }
}
