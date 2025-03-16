package com.A14_OOP.B10_Abstraction;

public class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * this.radius * this.radius;
    }
}
