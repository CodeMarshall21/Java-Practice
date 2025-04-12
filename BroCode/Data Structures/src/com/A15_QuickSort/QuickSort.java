package com.A15_QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        // quick sort = moves smaller elements to left of a pivot.
        //			   recursively divide array in 2 partitions

        //                       run-time complexity = Best case O(n log(n))
        //				   		                   Average case O(n log(n))
        //				   		                   Worst case O(n^2) if already sorted

        //                       space complexity    = O(log(n)) due to recursion

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        System.out.print("Array: ");
        for(int val :array){
            System.out.print(val + " ");
        }

        System.out.println("\nSorting...");

        quickSort(array);

        System.out.print("Sorted Array: ");
        for(int val :array){
            System.out.print(val + " ");
        }

    }

    private static void quickSort(int[] array) {

    }


}
