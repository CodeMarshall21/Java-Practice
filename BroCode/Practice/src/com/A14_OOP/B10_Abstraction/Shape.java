package com.A14_OOP.B10_Abstraction;

public abstract class Shape {

    abstract double area ();
    boolean isShape;

    void isShape(){
        isShape = true;
        System.out.println(isShape);
    }
}
