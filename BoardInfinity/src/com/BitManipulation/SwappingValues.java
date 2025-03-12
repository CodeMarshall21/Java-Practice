package com.BitManipulation;

import java.util.Scanner;

public class SwappingValues {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner in = new Scanner(System.in);

        System.out.print("Number 1: ");
        num1 = in.nextInt();
        System.out.print("\nNumber 2: ");
        num2 = in.nextInt();


        System.out.printf("Before Swapping\nNumber1: %d\nNumber2: %d\n",num1,num2);
        swap(num1,num2);

    }

    public static void swap(int num1, int num2){
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.printf("After Swapping\nNumber1: %d\nNumber2: %d", num1, num2);
    }
}
