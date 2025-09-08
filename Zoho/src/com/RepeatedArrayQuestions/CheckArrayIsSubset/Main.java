package com.RepeatedArrayQuestions.CheckArrayIsSubset;


/*
                Check if One Array is a Subset of Another
                Description:
                You're given two arrays: arr1[] and arr2[].
                You need to check if all elements of arr2 are present in arr1
                Note: Arrays in sorted order

                Example 1 :-
                arr1 -[1, 2, 3, 4]
                arr2 = [2, 4, 5]
                Output = false

                Example 2:-
                arr1 -[1, 2, 3, 4, 5]
                arr2 = [2, 4, 5]
                Output = true
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {2,4,5};
//
//        System.out.println(isSubset(arr1, arr2));

        TestCase[] testCases = {
                new TestCase(new int[]{1, 2, 3, 4}, new int[]{2, 4, 5}, false),
                new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{2, 4, 5}, true),
                new TestCase(new int[]{}, new int[]{}, true),
                new TestCase(new int[]{1, 2, 3}, new int[]{}, true),
                new TestCase(new int[]{}, new int[]{1}, false),
                new TestCase(new int[]{5}, new int[]{5}, true),
                new TestCase(new int[]{5}, new int[]{6}, false),
                new TestCase(new int[]{1, 2, 2, 3, 4}, new int[]{2, 2}, true),
                new TestCase(new int[]{1, 2, 3, 4}, new int[]{2, 2}, false),
                new TestCase(new int[]{-5, -3, -1, 0, 2, 4}, new int[]{-3, 0, 2}, true),
                new TestCase(new int[]{-5, -3, -1, 0, 2, 4}, new int[]{-3, 1}, false),
                new TestCase(new int[]{10, 20, 30, 40, 50}, new int[]{60}, false),
                new TestCase(new int[]{10, 20, 30, 40, 50}, new int[]{10, 20}, true),
                new TestCase(new int[]{1, 2}, new int[]{1, 2, 3}, false),
                new TestCase(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}, true),
                new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{3, 6}, false),
                new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{5, 5}, false),
                new TestCase(new int[]{1, 1, 2, 2, 3, 3}, new int[]{1, 2, 3}, true),
        };

        int i = 0;

        try {
            while (i < testCases.length) {
                TestCase test = testCases[i];
                boolean result = isSubset(test.arr1, test.arr2);

                System.out.println("Testcase " + (i + 1) + " :-");
                System.out.println("arr1: " + Arrays.toString(test.arr1));
                System.out.println("arr2: " + Arrays.toString(test.arr2));
                System.out.println("Output: " + result);
                System.out.println("Expected Output: " + test.expected);

                if (result == test.expected) {
                    System.out.println("Testcase Passed ✅");
                } else {
                    System.out.println("Testcase Failed ❌");
                }

                System.out.println("---------------------------------------");
                i++;
            }
        }catch(Exception e){
            System.out.println("Something went wrong in Testcase "+(i+1));
            System.out.println("Error: "+e);
        }


    }

    private static boolean isSubset(int[] arr1, int[] arr2){
//        int pointer1 = 0;
        int pointer2 = 0;
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        if(arr2Len == 0){
            return true;
        }

        if((arr1Len == 0) || (arr2Len > arr1Len)){
            return false;
        }


        for (int pointer1 = 0; pointer1 < arr1Len ; pointer1++){
            if(arr1[pointer1] == arr2[pointer2]){
                pointer2 ++;
            }
            if(pointer2 > arr2Len - 1){
                return true;
            }
        }
        if(pointer2 > arr2Len - 1){
            return true;
        }

        return false;

    }
}
