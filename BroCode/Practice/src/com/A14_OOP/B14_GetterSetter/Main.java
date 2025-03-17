package com.A14_OOP.B14_GetterSetter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Scanner in = new Scanner(System.in);

        Car car = new Car("corvette","blue",10000);

        //  car.model = "mustang" ->  'model' has private access ->  bring it out using public classes -> GETTER & SETTER

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        // Setter values ->

        System.out.print("color: ");
        String color = in.nextLine();

        System.out.print("price: ");
        int price = in.nextInt();


        car.setPrice(price);
        car.setColor(color);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());


in.close();
    }
}
