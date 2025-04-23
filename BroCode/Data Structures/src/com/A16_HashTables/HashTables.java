package com.A16_HashTables;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //			   Each key/value pair is known as an Entry
        //			   FAST insertion, look up, deletion of key/value pairs
        // 			   Not ideal for small data sets, great with large data sets

        // hashing = Takes a key and computes an integer (formula will vary based on key & data type)
        //		       In a Hashtable, we use the hash % capacity to calculate an index number

        //			key.hashCode() % capacity = index

        // bucket = an indexed storage location for one or more Entries
        //	            can store multiple Entries in case of a collision (linked similarly a LinkedList)

        // collision = hash function generates the same index for more than one key
        //			less collisions = more efficiency

        // Runtime complexity: Best Case O(1)
        //                     Worst Case O(n)


        Hashtable<Integer, String> table = new Hashtable<>();

//        public Hashtable() {                  Constructs a new hashtable with the same mappings as the given Map.
//           this(11, 0.75f);                   The hashtable is created with an initial capacity sufficient to hold
//        }                                     the mappings in the given Map and a default load factor (0.75).




        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        System.out.println("Hashtable<Integer, String> table = new Hashtable<>();");
        for(Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }


        Hashtable<String, String> table2 = new Hashtable<>();

//        public Hashtable() {                  Constructs a new hashtable with the same mappings as the given Map.
//           this(11, 0.75f);                   The hashtable is created with an initial capacity sufficient to hold
//        }                                     the mappings in the given Map and a default load factor (0.75).




        table2.put("100", "Spongebob");
        table2.put("123", "Patrick");
        table2.put("321", "Sandy");
        table2.put("555", "Squidward");
        table2.put("777", "Gary");
        System.out.println("Hashtable<String, String> table2 = new Hashtable<>();");
        for(String key : table2.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

    }
}
