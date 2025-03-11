package com.A14_OOP.B4_ArrayOfObjects;

public class Car {
    String model;
    String color;

    Car(String model,String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.printf("Your drive %s %s\n",this.color,this.model);
    }
}
