package com.A5_LinearSearch;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;

        int[] ans = search(arr,target);
        int maxVal = max(arr);
        int minVal = min(arr);

        System.out.println("Element at: "+ Arrays.toString(ans));

        System.out.println("Max value: "+maxVal);
        System.out.println("Min Value: "+minVal);
    }
    static int[] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target){
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int min(int[][]arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] < min){
                    min = arr[row][column];
                }
            }
        }
        return min;
    }

    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] > max){
                    max = arr[row][column];
                }
            }
        }
        return max;
    }
}
