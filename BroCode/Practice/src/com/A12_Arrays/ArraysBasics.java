package com.A12_Arrays;

import java.util.Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        String[] fruits2 = new String[5];

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        Arrays.sort(fruits);
        Arrays.fill(fruits2, "pineapple");

        for (String fruit : fruits) {
            System.out.print(fruit + " ");

        }
        System.out.println("\n");
        for (String fruit:fruits2){
            System.out.print(fruit+ " ");
        }
    }
}
