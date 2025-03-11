package com.A14_OOP.B1_Basics;

public class Main {
    public static void main(String[] args) {
        Car carObj = new Car();

        System.out.println("carObj.make -> "+carObj.make);
        System.out.println("carObj.model -> "+carObj.model);
        System.out.println("carObj.year -> "+carObj.year);
        System.out.println("carObj.isRunning -> "+carObj.isRunning);

        System.out.print("carObj.start(); -> ");
        carObj.start();
        System.out.println("carObj.isRunning -> "+carObj.isRunning);

        System.out.print("carObj.stop(); -> ");
        carObj.stop();
        System.out.println("carObj.isRunning -> "+carObj.isRunning);

        System.out.print("carObj.drive(); -> ");
        carObj.drive();
        System.out.println("carObj.isRunning -> "+carObj.isRunning);

        System.out.print("carObj.start(); -> ");
        carObj.start();
        System.out.println("carObj.isRunning -> "+carObj.isRunning);

        System.out.print("carObj.drive(); -> ");
        carObj.drive();
        System.out.println("carObj.isRunning -> "+carObj.isRunning);

    }
}
