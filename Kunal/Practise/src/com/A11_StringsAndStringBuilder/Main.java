package com.A11_StringsAndStringBuilder;

public class Main {
    public static void main(String[] args) {

        // Object created inside the string pool in the heap memory
        String a = "Keshav";
        String b = "Keshav";

        System.out.print("a == b : ");
        System.out.println(a==b); // a and b referencing same object


        // object(s) created outside the string pool in the heap memory
        String first = new String("Keshav1");
        String second = new String("Keshav1");

        System.out.print("first == second : ");
        System.out.println(first == second); // first and second referencing different objects

        System.out.print("first.equals(second) : ");
        System.out.println(first.equals(second));
    }
}
