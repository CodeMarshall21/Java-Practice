package com.A14_OOP.B10_Abstraction;

public abstract class Shape {

    abstract double area (); // ABSTRACT METHOD
    boolean isShape = false;

    void display(){ // CONCRETE METHOD
        System.out.print("This is a Shape !");
    }
}
