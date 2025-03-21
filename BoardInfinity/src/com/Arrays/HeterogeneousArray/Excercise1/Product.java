package com.Arrays.HeterogeneousArray.Excercise1;


public class Product {
    String name;
    int year;
    double price;

    Product(String name, int year, double price){
        this.name = name;
        this.year = year;
        this.price = price;
    }

    void showProduct(){
        System.out.println(this.name + " " + this.year + " " + this.price);
    }


}
