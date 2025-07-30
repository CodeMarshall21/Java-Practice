package com.A11_StringsAndStringBuilder;

public class Main {
    public static void main(String[] args) {
        String a = "Keshav";
        String b = "Keshav";

        System.out.println(a==b); // a and b referencing same object

        String first = new String("Keshav1");
        String second = new String("Keshav1");

        System.out.println(first == second); // first and second referencing different objects

    }
}
