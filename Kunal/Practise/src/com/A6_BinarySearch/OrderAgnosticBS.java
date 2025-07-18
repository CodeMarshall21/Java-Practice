package com.A6_BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};

        int target = 80;

        int pos = orderAgnosticBS(arr,target);
        System.out.printf("Element at: %d",pos);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        int count = 0;

        System.out.println("Array is in ascending order: "+isAsc);

        while(start <= end){
            int mid = start + (end - start) / 2;
            System.out.printf("iteration %d : ",++count);
            System.out.println("Current mid => "+ mid);

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid + 1;
                }else{
                    start = mid - 1;
                }

            }
        }
        return -1;
    }

}
