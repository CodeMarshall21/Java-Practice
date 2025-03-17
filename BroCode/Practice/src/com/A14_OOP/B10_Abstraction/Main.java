package com.A14_OOP.B10_Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //                   Abstraction is the process of hiding implementation details
        //                   and showing only the essential features.
        //                   Abstract classes CAN'T be instantiated directly.
        //                   Can contain 'abstract' methods (which must be implemented)
        //                   Can contain 'concrete' methods (which are inherited)

        Scanner in = new Scanner(System.in);
        int ch;

//        Shape shape = new Shape();        <- Error: 'Shape' is abstract; cannot be instantiated

        System.out.println("******** Menu ********");
        System.out.println("1.Circle\n2.Triangle\n3.Rectangle");
        System.out.print("Choice: ");
        ch = in.nextInt();

        switch(ch){
            case 1 -> {
                System.out.print("Radius: ");
                double radius = in.nextDouble();


                Circle circle = new Circle(radius);
                circle.display(); circle.isShape();
                System.out.printf("Area : %.2f",circle.area());

            }
            case 2 ->{
                System.out.print("Base: ");
                double base = in.nextDouble();
                System.out.print("\nHeight: ");
                double height = in.nextDouble();


                Triangle triangle = new Triangle(base,height);
                triangle.display(); triangle.isShape();
                System.out.printf("Area : %.2f",triangle.area());
            }
            case 3 -> {
                System.out.print("Length: ");
                double length = in.nextDouble();
                System.out.print("\nBreadth: ");
                double breadth = in.nextDouble();


                Rectangle rectangle = new Rectangle(length,breadth);
                rectangle.display(); rectangle.isShape();
                System.out.printf("Area : %.2f",rectangle.area());
            }
        }

    }
}
