package com.A14_OOP.B16_Composition;

public class Main {
    public static void main(String[] args) {
        // Composition = Represents a "part-of" relationship between objects.
        //                            For example, an Engine is "part of" a Car.
        //                            Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette",2003,"V8");

        System.out.println(car);
        car.start();
    }
}
