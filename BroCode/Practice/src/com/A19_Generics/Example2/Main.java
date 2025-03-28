package com.A19_Generics.Example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
        //                     that is compatible with different data types.
        //                     <T, U> type parameter (placeholder that gets replaced with a real type)
        //                     type argument (specifies the type)


        Product<String, Integer> product1 = new Product<>();
        Product<String, Double> product2 = new Product<>();


        product1.setProduct("Banana",69);
        product2.setProduct("Tickets",420.69);


        System.out.println("product1.getItem() -> "+product1.getItem());
        System.out.println("product1.getPrice() -> "+product1.getPrice());

        System.out.println("product2.getItem() -> "+product2.getItem());
        System.out.println("product2.getPrice() -> "+product2.getPrice());


    }
}
