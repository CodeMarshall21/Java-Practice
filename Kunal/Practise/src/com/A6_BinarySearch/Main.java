package com.A6_BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;

        int pos = binarySearch(arr,target);
        System.out.printf("Element at: %d",pos);

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            System.out.printf("iteration %d : ",++count);
            System.out.println("Current mid => "+ mid);

            if (target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                System.out.println("Element Found in "+count+" steps !!");
                return mid;
            }
        }

        return -1;
    }
}
