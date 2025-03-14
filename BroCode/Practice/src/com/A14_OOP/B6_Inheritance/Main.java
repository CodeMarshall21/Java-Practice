package com.A14_OOP.B6_Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println("\n");
        System.out.println("Organism -> Animal, Plant");
        System.out.println("Animal -> Cat, Dog");
        System.out.println("\n");

        System.out.println("********************************");
        System.out.println("About Dog (extends Animal class)");
        System.out.println("********************************");
        System.out.println("dog.isAlive: "+dog.isAlive);
        System.out.println("dog.canMove: "+dog.canMove);
        System.out.println("dog.lives: "+dog.lives);
        System.out.print("dog.sound() -> "); dog.sound();
        System.out.println("\n");

        System.out.println("\n********************************");
        System.out.println("About Cat (extends Animal class)");
        System.out.println("********************************");
        System.out.println("cat.isAlive: "+cat.isAlive);
        System.out.println("cat.canMove: "+cat.canMove);
        System.out.println("cat.lives: "+cat.lives);
        System.out.print("cat.sound() -> "); cat.sound();
        System.out.println("\n");

        System.out.println("\n********************************");
        System.out.println("About Plant (extends Organism Class)");
        System.out.println("********************************");
        System.out.println("plant.isAlive: "+plant.isAlive);
        System.out.print("plant.photosynthesis() -> "); plant.photosynthesis();
    }
}
