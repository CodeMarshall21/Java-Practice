package com.A6_BinarySearch;

public class Searching2DArray {
    public static void main(String[] args) {

    }
    static int[] binarySearch(int[][]matrix, int target){

        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0){
            if (matrix[row][column] == target){
                return new int [] {row, column};
            }

            if (matrix[row][column] < target){
                column--;
            }
            else{
                row++;
            }
        }

        return new int[]{-1,-1};
    }
}
