package com.A8_SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-65,-89,0,-21,5,1};
//        selectionSort(arr);
        anotherLogic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            // find the max item in the remaining array and swap with correct index
            int lastIndex = arr.length - i - 1; // to swap with n-i-1 th index
            int maxValIndex = maxVal(arr, 0, lastIndex);
            swapNums(arr, maxValIndex, lastIndex);
        }
    }

    static void swapNums(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    static int maxVal(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    // {-65,-89,0,-21,5,1}

    static void anotherLogic(int[] arr){
        int firstIndex = 0;
        int arrLen = arr.length;

        while(firstIndex < arrLen - 1){
            int minVal = firstIndex;
            for (int i = arrLen - 1; i >= firstIndex; i--) {
                if (arr[i] < arr[minVal]){
                    minVal = i;
                }
            }
            int temp = arr[firstIndex];
            arr[firstIndex] = arr[minVal];
            arr[minVal] = temp;

            firstIndex++;
        }
    }

}
