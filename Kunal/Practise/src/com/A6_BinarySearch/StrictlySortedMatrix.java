package com.A6_BinarySearch;

public class StrictlySortedMatrix {
    public static void main(String[] args) {

    }

    static int[] BinarySearch (int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][cMid] == target){
                return new int[] {row, cMid};
            }
            if(matrix[row][cMid] < target){
                cStart = cMid + 1;
            }else{
                cEnd = cMid - 1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search (int [][] matrix, int target){

    }
}
