package com.A12_Patterns;

public class Main {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2 (int n){
        // number of lines tbe pattern = number of rows => NUMBER OF TIMIES THE OUTTER LOOP WILL RUN
        for (int rows = 0; rows <= n-1 ; rows++) {
            // Identify for each row how many columns are there
            for (int columns = 0; columns <= rows; columns++) {
                // What do you need to print => here, "*"
                System.out.print("* ");
            }
            // After filling a row with required columns, add a new line
            System.out.println();
        }
    }
}
