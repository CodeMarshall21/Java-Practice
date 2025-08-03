package com.A12_Patterns;

public class Main {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern1 (int n){
        // number of lines tbe pattern = number of rows => NUMBER OF TIMES THE OUTER LOOP WILL RUN
        for (int rows = 1; rows <= n ; rows++) {
            // Identify for each row how many columns are there
            for (int columns = 1; columns <= n; columns++) {
                // What do you need to print => here, "*"
                System.out.print("* ");
            }
            // After filling a row with required columns, add a new line
            System.out.println();
        }
    }

    static void pattern2 (int n){
        // number of lines tbe pattern = number of rows => NUMBER OF TIMES THE OUTER LOOP WILL RUN
        for (int rows = 1; rows <= n ; rows++) {
            // Identify for each row how many columns are there
            for (int columns = 1; columns <= rows; columns++) {
                // What do you need to print => here, "*"
                System.out.print("* ");
            }
            // After filling a row with required columns, add a new line
            System.out.println();
        }
    }

    static void pattern3 (int n){
        // number of lines tbe pattern = number of rows => NUMBER OF TIMES THE OUTER LOOP WILL RUN
        for (int rows = 0; rows < n ; rows++) {
            // Identify for each row how many columns are there
            // TRY TO FIND THE FORMULA RELATING ROW AND COLUMN
            for (int columns = 0; columns < n-rows; columns++) {
                // What do you need to print => here, "*"
                System.out.print("* ");
            }
            // After filling a row with required columns, add a new line
            System.out.println();
        }
    }

    static void pattern4 (int n){
        // number of lines tbe pattern = number of rows => NUMBER OF TIMES THE OUTER LOOP WILL RUN
        for (int rows = 1; rows <= n ; rows++) {
            // Identify for each row how many columns are there
            // TRY TO FIND THE FORMULA RELATING ROW AND COLUMN
            for (int columns = 1; columns <= rows; columns++) {
                // What do you need to print => here, "columns" (th value itself)
                System.out.printf("%d ",columns);
            }
            // After filling a row with required columns, add a new line
            System.out.println();
        }
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

    static void pattern28(int n){
        for (int rows = 1; rows <= 2 * n - 1; rows++){

            int requiredColumns = rows <= n ? rows : 2 * n - rows;
            int requiredSpaces = n - requiredColumns;

            for (int spaces = 0; spaces < requiredSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int columns = 1; columns <= requiredColumns; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30 (int n){
        for (int rows = 1; rows <= n; rows++) {

            for (int spaces = 1; spaces <= n - rows ; spaces++) {
                System.out.print("  ");
            }

            for (int columns = rows; columns >= 1; columns--) {
                System.out.printf("%d ",columns);
            }
            for (int columns = 2; columns <= rows ; columns++) {
                System.out.printf("%d ",columns);
            }

            System.out.println();
        }
    }
}
