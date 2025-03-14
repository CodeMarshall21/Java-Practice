package com.A14_OOP.B6_Inheritance;

public class Cat extends Animal{
    int lives = 9;
    String speaks = "Meow";

    void sound(){
        System.out.printf("Cat says %s",speaks);
    }
}
