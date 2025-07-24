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
        int lastIndex = arr.length - 1;

        while(lastIndex > 0){
            int maxVal = 0;
            for (int i = 0; i <= lastIndex; i++) {
                if (arr[i] > arr[maxVal]){
                    maxVal = i;
                }
            }
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[maxVal];
            arr[maxVal] = temp;

            lastIndex--;
        }
    }

}
