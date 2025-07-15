package com.A3_FunctionsInJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int val1,val2;
        String greet;

        System.out.print("number1 : ");
        val1 = input.nextInt();

        System.out.print("number2 : ");
        val2 = input.nextInt();

        int sum = sum(val1,val2);
        System.out.println("sum : " + sum);

        input.nextLine(); // to clear the input buffer

        System.out.print("name : ");
        greet = input.nextLine();
        String returnVal = greet(greet);
        System.out.println(returnVal);

    }

    static int sum(int a,int b){
        return a+b;
    }
    static String greet(String name){
        String greetings = "Hello " + name;
        return greetings;
    }
}
