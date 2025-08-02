package com.A12_Patterns;

public class PatternFive {
    public static void main(String[] args) {
        patter5optimized(5);
    }

    static void patter5optimized(int n){
        for (int rows = 1; rows <= 2 * n - 1; rows++) {

            // Number of column in each row dependent on 'rows' value and 'n'
            // After few rows, find how many should we need to remove in each row
            // Subtract that number from 'n'

            int requiredColumns = rows <= n ? rows : 2 * n - rows;   // n - (rows - n) => 2 * n - rows
            for (int columns = 1; columns <= requiredColumns; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5 (int n){
        // number of lines tbe pattern = number of rows => NUMBER OF TIMES THE OUTER LOOP WILL RUN
        for (int rows = 1; rows <= 2*n-1 ; rows++) {
            // Identify for each row how many columns are there
            // TRY TO FIND THE FORMULA RELATING ROW AND COLUMN

            if (rows > n){
                // Number of column in each row dependent on 'rows' value and 'n'
                // After few rows, find how many should we need to remove in each row
                // Subtract that number from 'n'
                for (int columns = 1; columns <= n - (rows - n); columns++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int columns = 1; columns <= rows; columns++) {
                    // What do you need to print => here, "columns" (th value itself)
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
