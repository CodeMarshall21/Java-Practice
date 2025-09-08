package com.Others.RotateImage;

import java.util.Arrays;

public class Optimized {
    public static void main(String[] args) {
        int degree = 450;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rotations = (degree / 90) % 4;
        for (int i = 0; i < rotations ; i++) {
            rotateImage(matrix);
        }
        for(int[] rows: matrix){
            System.out.println(Arrays.toString((rows)));
        }

    }
    private static void rotateImage(int[][] matrix){
        int n = matrix.length;

        // Step 1: Transpose (swap across diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }
}
