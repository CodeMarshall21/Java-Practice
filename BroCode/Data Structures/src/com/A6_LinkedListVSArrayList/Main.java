package com.A6_LinkedListVSArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long startTime;
        long stopTime;
        long elapseTime;

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ****************LinkedList****************

        startTime = System.nanoTime();

//        linkedList.get(0);                Getting First Element
//        linkedList.get(500000);           Getting Middle Element
//        linkedList.get(999999);           Getting Last Element
//        linkedList.remove(0);             Removing at First
//        linkedList.remove(500000);        Removing at Middle
//        linkedList.remove(999999);        Removing at Last

        stopTime = System.nanoTime();
        elapseTime = stopTime - startTime;

        System.out.printf("LinkedList: %d ns",elapseTime);


        // ****************ArrayList****************

        startTime = System.nanoTime();

//        arrayList.get(0);                 Getting First Element
//        arrayList.get(500000);            Getting Middle Element
//        arrayList.get(999999);            Getting Last Element
//        arrayList.remove(0);              Removing at First
//        arrayList.remove(500000);         Removing at Middle
//        arrayList.remove(999999);         Removing at Last

        stopTime = System.nanoTime();
        elapseTime = stopTime - startTime;

        System.out.printf("\nArrayList: %d ns",elapseTime);



    }
}
