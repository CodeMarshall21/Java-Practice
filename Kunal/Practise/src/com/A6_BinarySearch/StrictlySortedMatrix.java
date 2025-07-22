package com.A6_BinarySearch;

import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
            int[][] matrix= {
                    {1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
                    {16,17,18,19,20},
                    {21,22,23,24,25}
        };
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        System.out.println(Arrays.toString((search(matrix,19))));
    }


    // search in the row provided between the cols provided

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
            int rows = matrix.length;
            int cols = matrix[0].length;

            if(cols == 0){
                return new int[]{-1,-1};
            }
            if(rows == 1){
                return BinarySearch(matrix, 0, 0, cols - 1, target);
            }


            int midCol = cols / 2;

            int rStart = 0;
            int rEnd = rows - 1;

        // run the loop till 2 rows are remaining
            while(rStart < (rEnd - 1) ){    // while this is true it will have more than 2 rows
                int midRow = rStart + (rEnd - rStart) / 2;

                if (matrix[midRow][midCol] == target){
                    return new int[]{midRow,midCol};
                }
                if(matrix[midRow][midCol] > target){
                    rEnd = midRow;
                }else{
                    rStart = midRow;
                }
            }

            // now we have two rows
            // check whether the target is in the col of 2 rows
            if(matrix[rStart][midCol] == target){
                return new int[]{rStart,midCol};
            }
            if(matrix[rStart + 1][midCol] == target){
                return new int[]{rStart + 1,midCol};
            }

            // search in 1st half
            if(target <= matrix[rStart][midCol - 1]){
                return BinarySearch(matrix, rStart, 0, midCol - 1, target);
            }

            // search in 2nd half
            if(target >= matrix[rStart][midCol + 1] && target <= matrix[rStart][cols - 1]){
                return BinarySearch(matrix, rStart, midCol+1, cols - 1, target);
            }

            // search in 3rd half
            if(target <= matrix[rStart + 1][midCol - 1]){
                return BinarySearch(matrix, rStart + 1, 0, midCol - 1, target);
            }

            // search in 4th half
            else{
                return BinarySearch(matrix, rStart + 1, midCol + 1, cols - 1, target);
            }


    }
}
