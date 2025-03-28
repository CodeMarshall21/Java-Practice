package com.A20_Hashmap.Example1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap = A data structure that stores key-value pairs
        //                      Keys are unique, but Values can be duplicated
        //                      Does not maintain any order, but is memory efficient
        //                      HashMap<Key, Value>


        HashMap<String, Double> hashmap = new HashMap<>();

        hashmap.put("apple", 0.50);
        hashmap.put("orange", 0.50);
        hashmap.put("banana", 0.25);
        hashmap.put("coconut", 1.00);
        hashmap.put("grapes", 1.65);



        System.out.println("hashmap.put(\"apple\", 0.50);\n" +
                "hashmap.put(\"orange\", 0.50);\n" +
                "hashmap.put(\"banana\", 0.25);\n" +
                "hashmap.put(\"coconut\", 1.00);");


        System.out.println("\nhashmap -> "+hashmap);
        hashmap.remove("apple");
        System.out.println("\nhashmap.remove(\"apple\") -> "+hashmap);
        System.out.println("\nhashmap.get(\"banana\") -> "+hashmap.get("banana"));
        System.out.println("\nhashmap.containsKey(\"orange\") -> "+hashmap.containsKey("orange"));
        System.out.println("\nhashmap.containsValue(\"0.25\") -> "+hashmap.containsValue(0.25));
        System.out.println("\nhashmap.size() -> "+hashmap.size());

        System.out.println("\nPrinting HashMap using advance for loop:- ");

        //      <- The keySet() method in Java
        //          is used to obtain a set view
        //          of the keys contained within a map.
        //          This method is part of the java.util.Map interface
        //          and is implemented by classes like HashMap, TreeMap, and LinkedHashMap.
        //          The keySet() method returns a Set object, which, by definition, does not allow duplicate elements.


        for(String key : hashmap.keySet()){
            System.out.println(key + " : " + hashmap.get(key));
        }

    }
}
