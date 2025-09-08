package com.RepeatedArrayQuestions.EqilibriumIndex;

import java.util.Arrays;

public class Optimized {
    public static void main(String[] args) {
        int[][] testCases = {
                {3, 4, 9, 6, 1},          // expected 2
                {1, 2, 3},                // expected -1
                {2, 3, -1, 2, 3},         // expected 2
                {0, 0, 0, 0},             // expected 0 (any index works, usually first)
                {5},                      // expected 0
                {-7, 1, 5, 2, -4, 3, 0},  // expected 3
                {10, -10, 5, 2},          // expected -1
                {1, 2, 3, 3},             // expected 2
                {1, 2, 3, 4, 6},          // expected 3
                {}                        // expected -1
        };
        for(int[] arr: testCases){
            System.out.println("Input: " + Arrays.toString(arr));
            System.out.println("Output: " + equilibriumIndexOptimized(arr));
            System.out.println("-----------------------------------------");

        }
    }

    private static int equilibriumIndexOptimized(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int totalSum = 0;

        for(int num: arr){
            totalSum += num;
        }

        int leftSum = 0;
        for (int index = 0; index < arr.length; index++) {
            int rightSum = totalSum - leftSum - arr[index]; // <------  say, the sum on the left and
            if(rightSum == leftSum){                        //          right of the current index you
                return index;                               //          are standing (excluding the current index)
            }                                               //          are the same.
            leftSum += arr[index];
        }
        return -1;
    }
}
