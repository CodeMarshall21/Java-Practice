package com.A19_Generics.Example1;

public class Box <T>{ //    <T> <- refers generic type (or it can be anything inside diamond operator)

    T item;     //      <- initialize variable "item" of 'T' generic data type

    public void setItem(T item){
        this.item = item;
    }

    public void getItem(){
        System.out.println(this.item);
    }

}
