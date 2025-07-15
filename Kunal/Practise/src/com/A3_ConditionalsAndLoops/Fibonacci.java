package com.A3_ConditionalsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long first = 0;
        long second = 1;
        int count = 2;
        int nthVal;
        long temp;

        System.out.print("n-value : ");
        nthVal = input.nextInt();

        while(count <= nthVal){
            temp = second;
            second += first;
            first = temp;
            count ++;
        }
        System.out.printf("%d th value of fibonacci is %d ", nthVal, second);
    }
}
