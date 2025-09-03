package com.April.ThirdLargest;

public class Main {
    public static void main(String[] args) {
        int [] arr ={100, 100, 90, 90, 80, 80, 70, 70};
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
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            }
            if (num < firstLargest && num > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            }
            if (num < secondLargest && num > thirdLargest){
                thirdLargest = num;
            }
        }

        if(secondLargest == Integer.MIN_VALUE || thirdLargest == Integer.MIN_VALUE){
            return -1;
        }

        return thirdLargest;
    }
}
