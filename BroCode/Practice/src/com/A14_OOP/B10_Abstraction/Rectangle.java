package com.A14_OOP.B10_Abstraction;

public class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length,double breadth){

        this.length = length;
        this.breadth = breadth;

    }

    @Override
    double area(){
        return this.breadth * this.length;
    }

}
