package com.A8_SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {

    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
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
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

}
