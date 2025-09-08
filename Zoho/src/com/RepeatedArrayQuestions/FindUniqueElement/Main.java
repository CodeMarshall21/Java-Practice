package com.RepeatedArrayQuestions.FindUniqueElement;

/*
        Find Unique Element
        Description:
        Given an array where every element appears twice, except
        one element which appears only once.

        Input = [4, 2, 5, 2, 4]
        Output = 5
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {4, 2, 5, 2, 4}

        int[][] testCases = {
                {4, 2, 5, 2, 4},            // expected 5
                {1, 1, 2},                  // expected 2 (minimum size valid array)
                {7, 3, 5, 3, 7},            // expected 5 (unique in middle)
                {10, 20, 10},               // expected 20 (unique in middle)
                {-1, -2, -1},               // expected -2 (works with negatives)
                {0, 1, 0},                  // expected 1 (works with zero)
                {99, 100, 100, 101, 101},   // expected 99 (unique at start)
                {50, 60, 70, 60, 50},       // expected 70 (unique in middle)
                {200, 300, 200},            // expected 300 (tiny case, unique last)
                {5, 6, 5, 7, 7},            // expected 6 (unique second element)
                {},
        };

        for(int[]arr : testCases){
            System.out.println("Input: "+ Arrays.toString(arr));
            System.out.println("Output: "+uniqueElement(arr));
            System.out.println("---------------------------------");
        }
    }
    private static int uniqueElement(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int xorSum = 0;
        for (int j : arr) {
            xorSum ^= j;
        }
        return xorSum;
    }
}
