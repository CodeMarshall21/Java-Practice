package com.A5_LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 53, 64, 33, -34, 45, 19};
        int target = 64;

        int pos = LinearSearch(arr,target,1,4);
        System.out.printf("Found at : %d", pos);
    }

    static int LinearSearch(int[] arr,int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target){
                return index;
            }
        }

        return -1;
    }
}
