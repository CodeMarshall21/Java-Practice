package com.A10_CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;      //   You're calculating where the current number actually belongs.
            if (arr[i] != arr[correctIndex]){   //   Is the number at index i already at its correct position?
                swap(arr, i, correctIndex);     //   Swap the current number with the one at its correct spot.
            }
            else{
                i ++;
            }
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
