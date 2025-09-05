package com.March22nd.LeadersInAnArray;

/*
            arr = [16,17,4,3,5,2]
            Output = 17, 5, 2
            CONSTRAINTS
            Time Complexity: O(n)

*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        leadersInAnArray(arr);

    }
    private static void leadersInAnArray(int[]arr){
        int[] leaders = new int[arr.length];
        int leader = Integer.MIN_VALUE;
        int index = 0;

        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(arr[i] > leader){
                leaders[index] = arr[i];
                leader = arr[i];
                index++;
            }
        }

//        reverseArray(leaders);

        for (int i = leaders.length - 1; i >= 0 ; i--) {
            if(leaders[i] != 0){
                System.out.print(leaders[i] + " ");
            }
        }
    }

//    private static void reverseArray(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end){
//            swap(arr, start, end);
//            start ++;
//            end --;
//        }
//    }
//
//    private static void swap(int[] arr, int start, int end){
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }
}
