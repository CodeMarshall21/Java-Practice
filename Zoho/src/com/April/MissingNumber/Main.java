package com.April.MissingNumber;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 0, 3, 4, 6, 1};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    private static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr, arr[i], i);
            }else{
                i++;
            }
        }
    }

    private static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
