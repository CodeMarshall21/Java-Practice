package com.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFunctions {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        System.out.println("queue.offer(\"Item 1\") => adding items");
        queue.offer("Item 1");
        queue.offer("Item 2");
        queue.offer("Item 3");
        queue.offer("Item 4");
        queue.offer("Item 5");
        System.out.println("Queue => "+queue);

        System.out.println("Head of Queue : queue.peek() => " + queue.peek());
        String head = queue.poll();
        System.out.println("removed element using \"queue.poll()\" => " + head);
        System.out.println("queue => "+queue);
        System.out.println("queue.isEmpty() => "+queue.isEmpty());
        System.out.println("queue.size() => "+queue.size());
        System.out.println("queue.contains(\"Item 3\") = > "+queue.contains("Item 3"));
        System.out.println("queue.contains(\"Item 6\") = > "+queue.contains("Item 6"));

    }
}
