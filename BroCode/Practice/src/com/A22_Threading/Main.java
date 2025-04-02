package com.A22_Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        //                       Helps improve performance with time-consuming operations
        //                      (File I/O, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        Scanner in = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);                     //      <-  This thread will end when Main thread finishes
        thread.start();

        System.out.print("Enter your name in 10 seconds: ");
        String input = in.nextLine();
        System.out.println("Hello "+input);

        in.close();
    }
}
