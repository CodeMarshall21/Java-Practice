package com.A14_OOP.B2_Constructors;

public class Main {
    public static void main(String[] args) {
        // constructor = A special method to initialize objects
        //                         You can pass arguments to a constructor
        //                         and set up initial values

        Students student1 = new Students("Spongebob", 30, 3.2);
        Students student2 = new Students("Patrick", 34, 1.5);
        Students student3 = new Students("Sandy", 27, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }
}
