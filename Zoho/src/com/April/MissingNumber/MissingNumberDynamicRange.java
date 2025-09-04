package com.April.MissingNumber;

import java.util.Arrays;

/*

Same missing number problem but the range of number is NOT 0 to 1 rather, just an array is given and goal is to find the first missing number

Sample input: 81,84,83,89,85,88
Sample output: 82 (even though 86, 87 are missing, the goal is to find FIRST MISSING number)

*/
public class MissingNumberDynamicRange {
    public static void main(String[] args) {
//        int[] arr = {203, 200, 202};

        int[][] testCases = {
                {81, 84, 83, 89, 85, 88},   // expected 82
                {200, 202},                 // expected 201
                {5, 6, 7, 9, 10},           // expected 8
                {1},                        // expected 2
                {},                         // expected -1
                {100, 101, 102},            // expected 103
                {2, 3, 4, 5, 7},            // expected 6
                {10, 11, 13, 12, 15},       // expected 14
                {50, 51, 52, 54},           // expected 53
                {7, 9, 8, 10, 12},          // expected 11
                {42},                       // expected 43
                {-1, 0, 1, 3},              // expected 2
                {-5, -4, -3, -1},           // expected -2
                {99, 100, 102},             // expected 101
                {500, 501, 502, 503},       // expected 504
        };

        for(int[] arr: testCases){
            System.out.println("Input: "+ Arrays.toString(arr));
            System.out.println("Output: "+missingNumber(arr));
            System.out.println("------------------------------");
        }
//        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        if(arr.length == 1){
            return arr[0] + 1;
        }


        sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        int index = 1;

        while(index < arr.length){
            if(arr[index] != arr[index - 1] + 1){
                return arr[index - 1] + 1;
            }
            index ++;
        }

        return arr[index - 1] + 1;
    }

    private static void sort(int[] arr){
        int firstIndex = 0;

        while(firstIndex < arr.length - 1){
            int minVal = firstIndex;
            for (int i = firstIndex + 1; i < arr.length; i++) {
                if(arr[i] < arr[minVal]){
                    minVal = i;
                }
            }

            swap(arr, firstIndex, minVal);
            firstIndex ++;
        }

    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

/*
this ues O(n²) time complexity. If allowed, you could use "Arrays.sort()" which uses O(n log n)
*/