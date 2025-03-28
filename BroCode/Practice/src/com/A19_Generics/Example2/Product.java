package com.A19_Generics.Example2;

public class Product <T, U>{    //  <- Using Two generic types

    T item;
    U price;

    public void setProduct(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }


}
