package com.April.MissingNumber;

import java.util.Arrays;

/*

Same missing number problem but the range of number is NOT 0 to 1 rather, just an array is given and goal is to find the first missing number

Sample input: 81,84,83,89,85,88
Sample output: 82 (even though 86, 87 are missing, the goal is to find FIRST MISSING number)

*/
public class MissingNumberDynamicRange {
    public static void main(String[] args) {
        int[] arr = {203, 200, 202};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr){
        if(arr.length == 1){
            return arr[0] + 1;
        }
        if(arr.length < 1){
            return -1;
        }

        sort(arr);
        System.out.println(Arrays.toString(arr));
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