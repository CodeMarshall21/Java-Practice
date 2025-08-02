package com.A12_Patterns;

public class Main {
    public static void main(String[] args) {
        pattern3(5);
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
            for (int columns = 1; columns <= n-rows; columns++) {
                // What do you need to print => here, "*"
                System.out.print("* ");
            }
            // After filling a row with required columns, add a new line
            System.out.println();
        }
    }
}
