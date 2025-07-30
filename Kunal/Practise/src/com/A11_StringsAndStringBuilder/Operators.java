package com.A11_StringsAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.print("'a'+'b' -> ");
        System.out.println('a'+'b');

        System.out.print("\"a\" + \"b\" -> ");
        System.out.println("a" + "b");

        System.out.print("'a' + 3 -> ");
        System.out.println('a' + 3);

        System.out.print("(char)('a' + 3) -> ");
        System.out.println((char)('a' + 3));


        System.out.print("\"a\" + 1 -> ");  // integer will be converted to Integer that will call toString()
        System.out.println("a" + 1);        // this is same as after a few steps: "a" + "1"

        System.out.print("\"Keshav\" + new ArrayList<>() -> ");
        System.out.println("Keshav" + new ArrayList<>());

        System.out.print("\"Keshav\" + new Integer(56)");
        System.out.println("Keshav" + new Integer(56));

        System.out.println("System.out.println(new ArrayList<>() + new Integer(56));      <- This is wrong as '+' operator adds only primitive and atleast one of them is string");
//        System.out.println(new ArrayList<>() + new Integer(56));      <- This is wrong as '+' operator adds only primitive and atleast one of them is string
        System.out.print("System.out.println(new ArrayList<>() + \" \" + new Integer(56)); -> ");
        System.out.println(new ArrayList<>() + " " + new Integer(56));
    }
}
