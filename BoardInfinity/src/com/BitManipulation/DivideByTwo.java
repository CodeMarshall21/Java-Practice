package com.BitManipulation;

import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        int num1;
        Scanner in = new Scanner(System.in);


        System.out.print("Num1: ");
        num1 = in.nextInt();

        System.out.printf("val: %d",DivideTwo(num1));

    }
    static int DivideTwo(int num1){
        num1 = num1 >> 1;
        return num1;
    }
}
