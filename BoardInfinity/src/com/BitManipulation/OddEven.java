package com.BitManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num1;

        Scanner in = new Scanner(System.in);

        System.out.print("Num: ");
        num1 = in.nextInt();

        if(isEven(num1)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    static boolean isEven(int num){
        boolean isIT;

        isIT = (num & 1) == 0;

        return isIT;
    }
}
