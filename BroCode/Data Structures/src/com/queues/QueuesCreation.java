package com.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesCreation {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        System.out.println("queue.offer(\"Item 1\") => adding items");
        queue.offer("Item 1");
        queue.offer("Item 2");
        queue.offer("Item 3");
        queue.offer("Item 4");
        queue.offer("Item 5");
        System.out.println("Queue => "+queue);

    }
}
