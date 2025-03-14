package com.A14_OOP.B9_toString;

public class Car {
    String model;
    String make;
    int year;
    String color;

    Car(String make,String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.make + " " + this.model + " " + this.year + " " + this.color + " ";
    }
}
