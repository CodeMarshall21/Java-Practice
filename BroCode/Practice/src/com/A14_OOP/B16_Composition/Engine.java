package com.A14_OOP.B16_Composition;

public class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println(this.type + " engine is running....");
    }
}
