package com.A11_SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // selection sort = search through an array and keep track of the minimum value during
        //			         each iteration. At the end of each iteration, we swap values.

        //				 Quadratic time O(n^2)
        //				 small data set = okay
        //				 large data set = BAD


        int [] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        System.out.print("Array: ");
        for (int val: array){
            System.out.print(val + " ");
        }

        System.out.println("\nSorting...");

        long start = System.nanoTime();
        selectionSort(array);
        long stop = System.nanoTime();
        long elapse = stop - start;

        System.out.print("Sorted Array: ");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println("\nTime Taken: "+elapse+" ns");


    }

    public static void selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            System.out.println("Array after Iteration "+i+ " " + Arrays.toString(array));
        }

    }
}
