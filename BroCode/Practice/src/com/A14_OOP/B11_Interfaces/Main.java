package com.A14_OOP.B11_Interfaces;

public class Main {
    public static void main(String[] args) {
        // Interface = A blueprint for a class that specifies a set of abstract methods
        //                     that implementing classes MUST define.
        //                     Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Hawk hawk = new Hawk();

        rabbit.flee();
        fish.flee();
        fish.hunt();
        hawk.hunt();


    }
}
