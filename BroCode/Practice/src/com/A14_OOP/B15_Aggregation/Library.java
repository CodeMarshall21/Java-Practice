package com.A14_OOP.B15_Aggregation;

public class Library {

    String name;
    int year;
    Books[] books;

    Library(String name, int year, Books[] book){
        this.name = name;
        this.year = year;
        this.books = book;
    }

    void displayInfo(){
        System.out.println(this.year + " " + this.name + "has the following books:- ");
        for (Books book : books){
            System.out.println(book.displayInfo());
        }
    }

}
