package com.April.MissingNumber;

public class SecondMethod {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(missingNumber2(arr));
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


    private static int missingNumber2(int[] arr){
        int arrLen = arr.length;
        if(arrLen == 0){
            return 0;
        }
        int actualTotal = (arrLen * (arrLen + 1))/2;    // Adds the numbers from 1 to N, N being the size of array

        for(int num: arr){
            actualTotal -= num;
        }

        return actualTotal;

    }
}
