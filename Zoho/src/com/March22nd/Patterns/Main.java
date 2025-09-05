package com.March22nd.Patterns;

/*
Explanation: https://youtu.be/-VSpmfyyHP0?si=8bp9bsXlX-NMQn60
*/


public class Main {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n){

        for (int row = 1; row <= n ; row++) {
            int val = row;
            for (int column = 1; column <= row; column++) {
                System.out.print(val + " ");
                val = val + (n - column);
            }
            System.out.println();
        }
    }
}
