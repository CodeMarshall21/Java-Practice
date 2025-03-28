package com.A19_Generics.Example1;

public class Main {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //                     that is compatible with different data types.
        //                     type parameter (placeholder that gets replaced with a real type)
        //                     type argument (specifies the type)

        Box<String> box1 = new Box<>();
        box1.setItem("Banana");
        box1.getItem();

        Box<Integer> quantity = new Box<>();
        quantity.setItem(69);
        quantity.getItem();



    }
}
