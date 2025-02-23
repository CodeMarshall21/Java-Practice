package com.A4_linkedLists;

import java.util.LinkedList;

public class LinkedListCreation {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        LinkedList<String> linkedlist2 = new LinkedList<String>();

        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");

        System.out.println("\nlinkedlist.push(\"A\");\n" + "linkedlist.push(\"B\");\n" + "linkedlist.push(\"C\");\n" + "linkedlist.push(\"D\");");
        System.out.println("linkedlist: "+linkedlist);

        linkedlist2.offer("A");
        linkedlist2.offer("B");
        linkedlist2.offer("C");
        linkedlist2.offer("D");

        System.out.println("\nlinkedlist2.offer(\"A\");\n" + "linkedlist2.offer(\"B\");\n" + "linkedlist2.offer(\"C\");\n" + "linkedlist2.offer(\"D\");");
        System.out.println("linkedlist2: "+linkedlist2);
    }
}
