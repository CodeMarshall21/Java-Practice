package com.A14_OOP.B10_Abstraction;

public class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length,double breadth){

        this.length = length;
        this.breadth = breadth;
        this.isShape = true;

    }

    void isShape(){

        System.out.println(isShape);
    }

    @Override
    double area(){
        return this.breadth * this.length;
    }

}
