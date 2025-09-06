package com.RepeatedArrayQuestions.FindBitonicPoint;

/*
            Find Bitonic Point
            Description:
            You are given a bitonic array — an array that first increases
            and then decreases. Your task is to find the bitonic point — the
            maximum element in this array.

            Input: [1, 3, 8, 12, 4, 2]
            Output : 12

*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] testCases = {
//                {1, 3, 8, 12, 4, 2},          // peak in the middle -> 12
//                {1, 2, 3, 4, 5, 4, 3, 2},     // long climb then drop -> 5
//                {10, 20, 30, 40, 50, 40, 30}, // peak at near end -> 50
//                {1, 6, 5},                    // smallest valid bitonic -> 6
//                {5, 10, 20, 15, 5},           // clear peak -> 20
//                {2, 4, 8, 16, 32, 16, 8},     // power sequence -> 32
//                {1, 3, 5, 7, 6, 4, 2},        // peak close to middle -> 7
//                {1, 2, 3, 2, 1},              // symmetric -> 3
                {0, 100, 99, 98, 97},         // sharp rise then fall -> 100
//                {97, 98, 99, 100, 0},         // Gradual rise then sharp fall -> 100
                {1, 2, 3, 4, 5, 6, 7, 8, 9},  // last peak -> 9
                {9, 8, 7, 6, 5, 4, 3, 2, 1},  // first peak -> 9
//                {1, 2, 3, 4, 5, 6, 5},        // peak near the end -> 6
        };

        for(int[] arr: testCases){
            System.out.println("Input: " + Arrays.toString(arr));
            System.out.println("Output: " + bitonicPoint(arr));
            System.out.println("---------------------------------------");
        }
    }

    private static int bitonicPoint(int [] arr){
        int bitonicPoint = 0;

        // Strategy: Binary Search

        if(arr.length < 3){
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2 ;

            if(mid == 0 || mid == arr.length - 1){
                return arr[mid];
            }
            else{
                if(arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]){
                    return arr[mid];
                }
                else if(arr[mid + 1] > arr[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


    private static int bitonicPointOptimized(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }else{
                right = mid;
            }

        }
        return arr[left];
    }
}
