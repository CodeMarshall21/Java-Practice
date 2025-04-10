package com.A7_LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        int index = linearSearch(arr,10);

        if (index != -1){
            System.out.println("Element Found at: "+ index);
        }
        else{
            System.out.println("Element not found !");
        }
    }

    private static int linearSearch(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i){
                return j;
            }
        }
        
        return -1;
        
    }
}
