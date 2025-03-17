package com.A14_OOP.B12_Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = "POLY-" = "MANY"
        //                               "-MORPH" = "SHAPE"
        //                               Objects can identify as other objects.
        //                               Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();


//        Car[] vehicles = {car,bike,boat}; //java: incompatible types: Bike cannot be converted to Car
//        Bike[] vehicles = {car,bike,boat}; //java: incompatible types: car cannot be converted to Bike
//        Boat[] vehicles = {car,bike,boat}; //java: incompatible types: car cannot be converted to Boat



        Vehicles[] vehicles = {car,bike,boat};

        for (Vehicles vehicle : vehicles){
            vehicle.go();
        }
    }
}
