package com.A14_OOP.B12_Polymorphism;

public class Car implements Vehicles{

    @Override
    public void go(){
        System.out.println("* You are driving the car.... *");
    }
}
