package com.A6_BinarySearch;

public class Main {
    public static void main(String[] args) {


    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target > mid){
                start = mid + 1;
            }
            else if(target < mid){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
