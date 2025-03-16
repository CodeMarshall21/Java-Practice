package com.A14_OOP.B11_Interfaces;

public class Hawk implements Predator{

    @Override
    public void hunt(){ // void hunt() -> attempting to assign weaker access privileges ('package-private'); was 'public'

        System.out.println("*Hawk is Hunting*");
    }
}
