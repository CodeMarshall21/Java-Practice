package com.A3_priorityQueue;
import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;



public class PriorityQueues {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.offer("B");
        queue.offer("D");
        queue.offer("A");
        queue.offer("E");
        queue.offer("C");
        queue.offer("F");

        System.out.println("\nQueue<String> queue = new PriorityQueue<String>();");
        while (!queue.isEmpty()){
            System.out.println("queue.poll() : "+queue.poll());
        }

        Queue<String> queue2 = new PriorityQueue<String>(Collections.reverseOrder());
        queue2.offer("B");
        queue2.offer("D");
        queue2.offer("A");
        queue2.offer("E");
        queue2.offer("C");
        queue2.offer("F");

        System.out.println("\nQueue<String> queue = new PriorityQueue<String>();");
        while (!queue2.isEmpty()){
            System.out.println("queue2.poll() : "+queue2.poll());
        }

    }
}
