package com.A14_OOP.B1_Basics;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 1995;
    boolean isRunning = false;

    void start(){
        System.out.println("You started the car....");
        isRunning = true;
    }
    void stop(){
        System.out.println("You STOPPED the car !");
        isRunning = false;
    }
    void drive(){
        if (isRunning){
            System.out.println("You are Driving");
        }else{
            System.out.println("START THE CAR TO DRIVE !!!");
        }
    }
}
