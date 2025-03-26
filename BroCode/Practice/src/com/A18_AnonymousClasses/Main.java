package com.A18_AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                                     Add custom behavior without having to create a new class.
        //                                     Often used for one time uses (TimerTask, Runnable, callbacks)


        Dog dog1 = new Dog();
        Dog scoobyDoo = new Dog(){
            @Override

            void speak(){
                System.out.println("Scooby says * Ruh roh * <- instead of creating a seperate class for \"talking dog\" we just Overriden a custom behaviour for Scooby");
            }
        };

        dog1.speak();
        scoobyDoo.speak(); //<- instead of creating a seperate class for "talking dog" we just Overriden a custom behaviour for Scooby
    }
}
