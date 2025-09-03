package com.April.SecondLargest;

public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 90, 90, 90, 50, 100, 75, 100};
        int sLargest = secondLargest(arr);
        System.out.println(sLargest);
    }

    public static int secondLargest(int[] arr){

        if(arr.length == 0||arr.length == 1){
            return -1;
        }

        int firstLargestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > firstLargestNumber){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = arr[i];
            }
            if(arr[i] < firstLargestNumber && arr[i] > secondLargestNumber){
                secondLargestNumber = arr[i];
            }
        }
        if(secondLargestNumber == Integer.MIN_VALUE){
            return firstLargestNumber;
        }
        return secondLargestNumber;
    }
}
