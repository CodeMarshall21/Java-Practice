package com.A14_OOP.B14_GetterSetter;

public class Car {
    private String model;
    private String color;
    private int price;


    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

 // GETTER methods ->
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$"+this.price;
    }

  // SETTER methods ->
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        this.price = price;
    }


}
