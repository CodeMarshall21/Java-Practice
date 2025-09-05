package com.March22nd.LargestNumberFromArrayOfDigits;

/*
            Largest Number from an Array of Digits
            arr = [8, 7, 1, 1, 9]
            output = 98711

            CONSTRAINTS
            Time Complexity: O(n)
*/


public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 9, 1};
        System.out.println(largestNumber(arr));
    }

    private static String largestNumber (int[] arr){
        StringBuilder largestNumber = new StringBuilder();

        int[] count = new int[10];
        for (int num : arr) {
            count[num] += 1;
        }

        for (int i = 9; i >= 0; i--) {
            if(count[i] >= 1){
                largestNumber.append(String.valueOf(i).repeat(count[i]));
            }
        }

        return largestNumber.toString();
    }
}
