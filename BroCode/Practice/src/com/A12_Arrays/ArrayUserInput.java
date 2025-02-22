package com.A12_Arrays;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String[] foods = {};
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("Enter food %d: ",i);
//            foods[i] = in.nextLine();
//        }
        System.out.println(
                "        String[] foods = {};\n" +
                "        for (int i = 0; i < 10; i++) {\n" +
                "            System.out.printf(\"Enter food %d: \",i);\n" +
                "            foods[i] = in.nextLine();\n" +
                "        }" +
                "" +
                "\nGives out ArrayIndexOutOfBound Error so declare the array size first");
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter food %d: ",i);
            array[i] = in.nextLine();
        }

        for (String food : array){
            System.out.print(food+" ");
        }




        in.close();
    }
}
