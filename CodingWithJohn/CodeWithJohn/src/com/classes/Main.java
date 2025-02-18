package com.classes;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cat anotherCat = new Cat();
        myCat.name = "Cat 1";
        myCat.age = 12;
        System.out.printf("myCat.name : %s \nmyCat.age : %d",myCat.name,myCat.age);
        System.out.println("\nmyCat.meow(); -> ");myCat.meow();
        anotherCat.name = "Cat 2";
        anotherCat.age = 14;
        System.out.printf("\nanotherCat.name : %s \nanotherCat.age : %d",anotherCat.name,anotherCat.age);
        System.out.println("\nCat.dingdong() - > ");
        Cat.dingdong();
    }
}
