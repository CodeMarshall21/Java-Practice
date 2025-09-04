package com.April.MissingNumber;

import java.util.Arrays;

/*
Find the Missing Number from 0 to n distinct numbers

logic:-
    1. use cyclic sort to sort numbers from 0 - n
    2. any number not in correct position, the number which should've been in that position is the missing number
    3. if every number is in correct position, then the length of the arr is the missing number

*/
public class Main {
    public static void main(String[] args) {
        int[][] testCases = {
                {0, 1, 3},                  // n=3, missing 2
                {3, 0, 1},                  // n=3, missing 2 (unsorted)
                {0, 1, 2, 4},               // n=4, missing 3
                {1},                        // n=1, missing 0
                {0},                        // n=1, missing 1
                {0, 2, 3, 4, 5},            // n=5, missing 1
                {1, 2, 3, 4, 5},            // n=5, missing 0
                {0, 1, 2, 3, 4},            // n=5, missing 5
                {5, 4, 3, 2, 0},            // n=5, missing 1 (unsorted)
                {9, 6, 4, 2, 3, 5, 7, 0, 1} // n=9, missing 8
        };
        for(int[] arr: testCases){
            System.out.println("Input: " + Arrays.toString(arr));
            System.out.println("Output: " + missingNumber(arr));
            System.out.println("----------------------------------------");
        }
    }

    private static int missingNumber(int[] arr){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    private static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr, arr[i], i);
            }else{
                i++;
            }
        }
    }

    private static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
