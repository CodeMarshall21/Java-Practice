package com.April.MissingNumber;

public class SecondMethod {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr){
        int missingNumber;
        int originalSum = 0;
        int arrSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            originalSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        missingNumber = originalSum - arrSum;
        return missingNumber;
    }
}
