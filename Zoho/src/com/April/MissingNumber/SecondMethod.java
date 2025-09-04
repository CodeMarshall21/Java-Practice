package com.April.MissingNumber;

import java.util.Arrays;

public class SecondMethod {
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
            System.out.println("Output: " + missingNumber2(arr));
            System.out.println("----------------------------------------");
        }
    }

    private static int missingNumber(int[] arr){
        int missingNumber;
        int originalSum = 0;
        int arrSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            originalSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        missingNumber = originalSum - arrSum;
        return missingNumber;
    }


    private static int missingNumber2(int[] arr){
        int arrLen = arr.length;
        if(arrLen == 0){
            return 0;
        }
        int actualTotal = (arrLen * (arrLen + 1))/2;    // Adds the numbers from 1 to N, N being the size of array

        for(int num: arr){
            actualTotal -= num;
        }

        return actualTotal;

    }
}
