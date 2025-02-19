package com.queues;

import java.util.LinkedList;
import java.util.Queue;
//import java.util.Stack;
import java.util.Scanner;

public class RotatingArray {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner input = new Scanner (System.in);
        int rotations;
        for (int i = 1; i < 11; i++) {
            queue.offer(i);
        }
        System.out.println(queue);
        System.out.print("NUmber of rotations : ");
        rotations = input.nextInt();

        for (int i = 0; i < rotations; i++) {
            queue.offer(queue.poll());
        }
        System.out.println(queue);
    }
}
