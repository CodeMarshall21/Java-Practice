package com.A14_OOP.B11_Interfaces;

public class Fish implements Prey,Predator{ // <- Java implement Multiple Inhertance using interfaces




    @Override
    public void hunt(){
        System.out.println("*Fish is Hunting*");
    }

    @Override
    public void flee(){
        System.out.println("*Fish is Swimming away*");
    }
}
