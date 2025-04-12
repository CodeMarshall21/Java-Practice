package com.A12_InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Insertion sort = after comparing elements to the left,
        //				shift elements to the right to make room to insert a value

        //				Quadratic time O(n^2)
        //				small data set = decent
        //				large data set = BAD

        //				Less steps than Bubble sort
        //				Best case is O(n) compared to Selection sort O(n^2)

        int [] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        System.out.print("Array: ");
        for (int val: array){
            System.out.print(val + " ");
        }

        System.out.println("\nSorting...");
        long start = System.nanoTime();
        insertionSort(array);
        long stop = System.nanoTime();
        long elapse = stop - start;

        System.out.print("Sorted Array: ");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println("\nTime Taken: "+elapse+" ns");

    }



    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && temp < array[j]){
                array[j+1] = array[j];
                j-- ;
            }
            array[j+1] = temp;
            System.out.println("Array after Iteration "+i+" : "+ Arrays.toString(array));
        }
    }
}
