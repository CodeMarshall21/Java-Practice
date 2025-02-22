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
                "\nGives out ArrayIndexOutOfBound Error so declare the foods size first");
        String[] foods;
        System.out.print("Array Length: ");
        int size  = in.nextInt();
        in.nextLine();

        foods = new String[size];


        for (int i = 0; i < foods.length; i++) {
            System.out.printf("Enter food %d: ",i);
            foods[i] = in.nextLine();
        }

        for (String food : foods){
            System.out.print(food+" ");
        }




        in.close();
    }
}
