package com.A13_Recursion.A1_Intro;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth Term: ");
        int term = in.nextInt();
//        System.out.println(term);

        System.out.printf("%dth term is : %d",term,fibo(term));
    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
