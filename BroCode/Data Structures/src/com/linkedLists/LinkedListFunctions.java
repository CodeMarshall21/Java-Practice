package com.linkedLists;

import java.util.LinkedList;

public class LinkedListFunctions {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        LinkedList<String> linkedlist2 = new LinkedList<String>();

        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("D");
        linkedlist.push("E");

        System.out.println("\nlinkedlist.push(\"A\");\n" + "linkedlist.push(\"B\");\n" + "linkedlist.push(\"D\");\n" + "linkedlist.push(\"E\");");
        System.out.println("linkedlist: "+linkedlist);
        linkedlist.add(2,"C");
        System.out.println("linkedlist.add(2,\"C\"); -> "+linkedlist);
        linkedlist.remove("E");
        System.out.println("linkedlist.remove(\"E\"); -> "+linkedlist);
        while(!linkedlist.isEmpty()){
            System.out.println("linkedlist.pop(): "+linkedlist.pop());
        }

        linkedlist2.offer("A");
        linkedlist2.offer("B");
        linkedlist2.offer("C");
        linkedlist2.offer("D");

        System.out.println("\nlinkedlist2.offer(\"A\");\n" + "linkedlist2.offer(\"B\");\n" + "linkedlist2.offer(\"C\");\n" + "linkedlist2.offer(\"D\");");
        System.out.println("linkedlist2: "+linkedlist2);

        System.out.println("linkedlist2.indexOf(\"B\") -> "+linkedlist2.indexOf("B"));
        System.out.println("linkedlist2.peekFirst() -> "+linkedlist2.peekFirst());
        System.out.println("linkedlist2.peekLast() -> "+linkedlist2.peekLast());

        linkedlist2.addFirst("Z");
        System.out.println("linkedlist2.addFirst(\"Z\"); -> "+linkedlist2);

        linkedlist2.addLast("E");
        System.out.println("linkedlist2.addLast(\"E\"); -> "+linkedlist2);

        linkedlist2.removeFirst();
        System.out.println("linkedlist2.removeFirst(); -> "+linkedlist2);

        linkedlist2.removeLast();
        System.out.println("linkedlist2.removeLast(); -> "+linkedlist2);



        while(!linkedlist2.isEmpty()){
            System.out.println("linkedlist.pop(): "+linkedlist2.poll());
        }



    }
}
