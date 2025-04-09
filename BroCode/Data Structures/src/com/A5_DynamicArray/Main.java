package com.A5_DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(10);
        dynamicArray.add(9);
        dynamicArray.add(8);
        dynamicArray.add(7);
        dynamicArray.add(6);

        dynamicArray.insert(2,"Hello");
        dynamicArray.delete(7);
//        dynamicArray.delete(6);
//        dynamicArray.delete(8);



        System.out.println("dynamicArray -> "+dynamicArray);
        System.out.println("Capacity -> "+dynamicArray.capacity);
        System.out.println("Size -> "+dynamicArray.size);
        System.out.println("isEmpty() -> "+dynamicArray.isEmpty());
        System.out.println("get(2) -> "+dynamicArray.get(2));
        System.out.println("search(9) -> "+dynamicArray.search(9));
        System.out.println("search(\"world\") -> "+dynamicArray.search("world"));



    }
}
