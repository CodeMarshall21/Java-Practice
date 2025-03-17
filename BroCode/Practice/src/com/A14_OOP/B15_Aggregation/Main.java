package com.A14_OOP.B15_Aggregation;

public class Main {
    public static void main(String[] args) {
        // Aggregation = Represents a "has-a" relationship between objects.
        //                           One object contains another object as part of its structure,
        //                           but the contained object/s can exist independently.


        Books book1 = new Books("The Fellow of the Ring", 423);
        Books book2 = new Books("The Two Towers", 352);
        Books book3 = new Books("The Return of the King", 416);

        Books[] books = {book1,book2,book3};

        Library lib = new Library("NYC Public Library", 1897, books);

        lib.displayInfo();
    }
}
