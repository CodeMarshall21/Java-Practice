package com.A11_StringsAndStringBuilder;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Keshav K V Hello World";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toUpperCase());
        System.out.print(name);
        System.out.println(" <-- this proves that new object is created");
    }
}
