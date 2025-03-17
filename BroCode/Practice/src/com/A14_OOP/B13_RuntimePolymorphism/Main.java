package com.A14_OOP.B13_RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism = When the method that gets executed is decided
        //                                               at runtime based on the actual type of the object.


//        Animal animal = new Animal();     <- 'Animal' is abstract; cannot be instantiated

        Scanner in = new Scanner(System.in);

        Animal animal;


        System.out.print("Animal ? \n1 -> Dog\n2 -> Cat\nChoice: ");
        int choice = in.nextInt();

        switch (choice){
            case 1 -> {
                animal = new Dog();
                animal.speak();
            }
            case 2 -> {
                animal = new Cat();
                animal.speak();
            }
        }

        in.close();

    }
}
