package com.A11_StringsAndStringBuilder;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // 'out' from 'Printstream' class has 'println' method
        System.out.println(56);         // here, println calls -> writeln(String.valueOf(x)); 'valueOf()' returns -> Integer.toString(i);
        System.out.println("Keshav");   // here 'valueOf()' returns ->  return (obj == null) ? "null" : obj.toString(); toString() returns -> return getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(new int[]{2, 3, 4, 5});
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5})); // here, we are overriding to use 'toString()' method from 'Arrays' class
    }
}
