package com.April.MissingNumber;
/*
Find the Missing Number from 0 to n distinct numbers

logic:-
    1. use cyclic sort to sort numbers from 0 - n
    2. any number not in correct position, the number which should've been in that position is the missing number
    3. if every number is in correct position, then the length of the arr is the missing number

*/
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
