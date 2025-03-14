package com.A14_OOP.B7_SuperKeyword;

public class Person {
    String first;
    String last;

    Person(String fname, String lname){
        this.first = fname;
        this.last = lname;
    }

    void name(){
        System.out.println("name's "+this.first+" "+this.last);
    }
}
