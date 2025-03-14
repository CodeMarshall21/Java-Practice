package com.A14_OOP.B6_Inheritance;

public class Dog extends Animal{
    int lives = 1;
    String speaks = "Woof";

    void sound(){
        System.out.printf("Dog says %s",speaks);
    }
}
