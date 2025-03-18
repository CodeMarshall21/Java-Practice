package com.A14_OOP.B16_Composition;

public class Car {
    String model;
    int year;
    Engine engine;

    Car(String model,int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    @Override
    public String toString(){
        return this.year + " " + this.engine.type + " " + this.model;
    }

    void start(){
        this.engine.start();
        System.out.println(this.model + " is running....");

    }

}
