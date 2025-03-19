package com.A16_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // Exception = An event that interrupts the normal flow of a program
        //                      (Dividing by zero, file not found, mismatch input type)
        //                      Surround any dangerous code with a try{} block
        //                      try{}, catch{}, finally{}

        // try{} can have multiple catch(){} statements <- COMPULSORY 'catch' or 'finally' expected
        // finally{} <- optional -> Always Executes ->
        //                          used to close a file, close an object like Scanner object (because it won't close itself once exception is encountered)


        Scanner in = new Scanner(System.in);
        int val;
        System.out.print("Enter a number: ");


        try{
            val = in.nextInt();
        }catch(InputMismatchException e){ // <- import java.util.InputMismatchException;
            System.out.println(e + " <-> Enter INTEGER NUMBER ONLY !!!");
        } catch (Exception e) { //its better to catch the specific Exception first then the common exception
            System.out.println("SOMETHING WENT WRONG !!!");
        }
        finally {
            in.close();
        }


    }
}
