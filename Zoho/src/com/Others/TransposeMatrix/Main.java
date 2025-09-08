package com.Others.TransposeMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        transposeMatrix(matrix);

        for(int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    private static void transposeMatrix(int[][] matrix){
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
