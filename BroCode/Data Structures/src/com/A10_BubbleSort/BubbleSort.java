package com.A10_BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort = pairs of adjacent elements are compared, and the elements
        //		            swapped if they are not in order.

        //				 Quadratic time O(n^2)
        //				 small data set = okay-ish
        //				 large data set = BAD (plz don't)


        int [] array = {2,5,6,4,8,9,7,1,0,3};


        System.out.print("Array: ");
        for (int val : array){
            System.out.print(val+" ");
        }

        System.out.println("\nSorting....");

        bubbleSort(array);

        System.out.print("Sorted Array: ");
        for (int val : array){
            System.out.print(val+" ");
        }



    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Array Swaps at Iteration "+i+" :-");

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    System.out.println(Arrays.toString(array));
                }
            }
            System.out.println("Array after Iteration "+i+ " " + Arrays.toString(array));
            System.out.println("\n");
        }
    }
}
