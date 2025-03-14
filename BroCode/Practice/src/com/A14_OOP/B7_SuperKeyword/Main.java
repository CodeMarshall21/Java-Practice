package com.A14_OOP.B7_SuperKeyword;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // super = Refers to the parent class
        //               Used in constructors and method overriding
        //               Calls the parent constructor to initialize attributes

        Person guy = new Person("Tom","Riddle");
        Student highSchooler = new Student("Harry","Potter",6.9);
        Employee manager = new Employee("Rubus","Hagrid",69000);


        System.out.println("Person :- ");
        guy.name();
        System.out.println("\n");

        System.out.println("Student :- ");
        highSchooler.name();
        highSchooler.gpaIs();
        System.out.println("\n");

        System.out.println("Employee :- ");
        manager.name();
        manager.salaryIs();

    }



}
