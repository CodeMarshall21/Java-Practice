package com.A9_InsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {98, -76, -21, 34, -56, 0, 56, 100};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j >= 1 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j -1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
