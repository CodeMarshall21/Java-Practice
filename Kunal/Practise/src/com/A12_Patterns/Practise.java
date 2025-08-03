package com.A12_Patterns;

public class Practise {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern6(int n){
        for (int rows = 1; rows <= n; rows++) {
            int requiredSpace = n - rows;

            for (int spaces = 1; spaces <= requiredSpace; spaces++) {
                System.out.print(" ");
            }

            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int rows = 1; rows <= n; rows++) {

            for (int spaces = 0; spaces < rows - 1 ; spaces++) {
                System.out.print(" ");
            }

            for (int columns = 1; columns <= n - (rows - 1); columns++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int rows = 1; rows <= n; rows++) {
            int requiredSpaces = n - rows;
            for (int spaces = 0; spaces < requiredSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for (int rows = 1; rows <= n; rows++) {
            int requiredSpaces = rows - 1;
            for (int spaces = 1; spaces <= requiredSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= n - (rows - 1); column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
