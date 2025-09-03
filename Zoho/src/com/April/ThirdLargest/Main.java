package com.April.ThirdLargest;

public class Main {
    public static void main(String[] args) {
        int [] arr ={-1, -2, -3, -4, -5};
        System.out.println(thirdLargest(arr));
    }
    private static int thirdLargest(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if(num == firstLargest || num == secondLargest || num == thirdLargest){
                continue;
            }
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            }
            else if (num > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            }
            else if (num > thirdLargest){
                thirdLargest = num;
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return firstLargest;
        }
        if( thirdLargest == Integer.MIN_VALUE){
            return -1;
        }

        return thirdLargest;
    }
}
