package com.ProblemSolving.SingingChamps;

import java.util.Scanner;

public class SingingChamps {
    public static void main(String[] args) {
        // finding the nearest 2^n

        Scanner in = new Scanner(System.in);
        int n;
        int val = 1;

        System.out.print("Number: ");
        n = in.nextInt();

        while(val*2 <= n){
            val *= 2;
        }
        System.out.println(val);
    }
}
