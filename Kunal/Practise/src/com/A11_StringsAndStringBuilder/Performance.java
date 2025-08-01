package com.A11_StringsAndStringBuilder;

public class Performance {
    public static void main(String[] args) {
        System.out.println("\"a\" + \"b\" = \"ab\"   <- \"ab\" is a whole new object");

        String series = "";
        for (int i = 0; i < 26; i++) {
            series += (char)('a'+i);
        }
        System.out.print("series -> ");
        System.out.println(series);

        // The above example of wastage of space and inefficient method,
        // were there is a new object created every time a character is concatenated.
        // So there are 25 other objects without any reference variable
        // so we use "StringBuilder" in which no new objects are created for every change
    }
}
