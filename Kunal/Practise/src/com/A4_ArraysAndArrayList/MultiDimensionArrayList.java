package com.A4_ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int obj = 0; obj < 3; obj++) {
            list.add(new ArrayList<>()); // create object for each row
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list.get(row).add(in.nextInt());
            }

        }

        System.out.println(list);



    }
}
