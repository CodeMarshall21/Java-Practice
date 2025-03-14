package com.A14_OOP.B7_SuperKeyword;

public class Student extends Person{
    double gpa;

    Student(String fname, String lname, double gpa ){
        super(fname,lname);
        this.gpa = gpa;
    }

    void gpaIs(){
        System.out.println("GPA is: "+this.gpa);
    }
}
