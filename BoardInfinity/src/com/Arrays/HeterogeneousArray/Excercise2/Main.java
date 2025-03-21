package com.Arrays.HeterogeneousArray.Excercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Since Object is the superclass of all classes in Java, an array of type Object can hold different types of elements.

        Object[] object = new Object[5];
        Scanner in = new Scanner(System.in);

        object[0] = 69;
        object[1] = 3.14;
        object[2] = "Hello World";
        object[3] = true;
        object[4] = 'C';

        for(Object item:object){
            System.out.println(item);
        }

    }
}
