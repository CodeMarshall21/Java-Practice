package com.A14_OOP.B4_ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        // Array of Objects
        Car[] cars = {
                    new Car("Mustang","Red"),
                    new Car("Ferrari","White"),
                    new Car("Lamborghini","Purple")
        }; //these are "ANONYMOUS OBJECTS" 

        for(Car car: cars){
            car.drive();
        }
    }
}
