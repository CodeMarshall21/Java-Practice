package com.A1_Basics;

import java.util.Scanner;


public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /*
        To Read:

        nextByte();
        nextShort();
        nextInt();
        nextLong();
        nextFloat();
        nextDouble();
        nextBoolean();
        nextLine();
        next();
        */

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.println("Name is " + name + ", Hello " + name + " !");

        System.out.print("Full Name: ");
        String fname = input.next();
        System.out.println("first name : " + fname);

        //to clear the rest in input buffer.
        input.nextLine();
        /*
        For eg :
        1. You entered a full name (Rangaraaya Shakthivel Nayakan) with spaces, and next() reads only the
        first word (Rangaraaya) as the full name. The rest (Shakthivel Nayakan) remains in the input buffer.

        2. When the program reaches nextInt(), it attempts to parse the leftover input (Shakthivel) as an integer,
        leading to the InputMismatchException.
        */


        System.out.print("Integer: ");
        int integer = input.nextInt();
        System.out.println("Integer is " + integer + ", Hello " + integer + " !");


        System.out.print("Floating Point: ");
        float decimal = input.nextFloat();
        System.out.println("Float is " + decimal + ", Hello " + decimal + " !");

        input.close();
    }
}
