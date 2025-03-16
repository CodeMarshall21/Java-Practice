package com.A14_OOP.B10_Abstraction;

public class Triangle extends Shape{

    double height;
    double base;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
        this.isShape = true;
    }

    void isShape(){

        System.out.println(isShape);
    }

    @Override
    double area(){
        return 0.5 * this.base * this.height;
    }
}
