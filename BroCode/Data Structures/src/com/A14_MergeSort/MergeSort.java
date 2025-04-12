package com.A14_MergeSort;

public class MergeSort {
    public static void main(String[] args) {
        // merge sort = recursively divide array in 2, sort, re-combine
        // run-time complexity = O(n Log n)
        // space complexity    = O(n)


        int[] arr = {8, 2, 5, 3, 4, 7, 6, 1};

        System.out.print("Array: ");
        for(int val :arr){
            System.out.print(val + " ");
        }

        System.out.println("\nSorting...");
        long start = System.nanoTime();
        mergeSort(arr);
        long stop = System.nanoTime();
        long elapse = stop - start;

        System.out.print("Sorted Array: ");
        for(int val :arr){
            System.out.print(val + " ");
        }

        System.out.println("\nTime Taken: "+elapse+" ns");

    }

    public static void mergeSort(int[]array){

        int arrayLength = array.length;
        if (arrayLength <= 1){
            return ;
        }

        int middle = (arrayLength / 2);
        int [] leftArray = new int[middle];
        int [] rightArray = new int[arrayLength - middle];

        int i = 0;
        int j = 0;

        for (; i < arrayLength; i++) {
            if (i < middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);

    }

    public static void merge (int[] leftArray, int[] rightArray, int[] array){
        int i = 0;
        int j = 0;
        int k = 0;
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        while(i < leftLength && j < rightLength){
            if (leftArray[i] < rightArray[j]){
                array[k] = leftArray[i];
                i ++;
                k ++;
            }
            else{
                array[k] = rightArray[j];
                j ++;
                k ++;
            }
        }

        while (i < leftLength){
            array[k] = leftArray[i];
            i ++;
            k ++;
        }

        while (j < rightLength){
            array[k] = rightArray[j];
            j ++;
            k ++;
        }
    }
}
