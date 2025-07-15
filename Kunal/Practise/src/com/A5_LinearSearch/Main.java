package com.A5_LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 53, 64, 33, -34, 45, 19};
        int target = 64;

        int pos = LinearSearch(arr,target);
        System.out.printf("Found at : %d", pos);
    }

    static int LinearSearch(int[] arr,int target){

        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return index;
            }
        }

        return -1;
    }
}
