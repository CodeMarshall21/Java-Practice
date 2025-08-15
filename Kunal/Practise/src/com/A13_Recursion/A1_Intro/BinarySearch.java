package com.A13_Recursion.A1_Intro;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 16, 34, 56, 77, 89};
        int target = 0;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(arr, target, start, end));
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return binarySearch(arr, target, start, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);

    }
}
