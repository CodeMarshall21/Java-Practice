package com.A23_MultiThreading;

public class MyRunnable implements Runnable{

    private final String text;


    MyRunnable(String text){
        this.text = text;
    }


    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(text);

            } catch (InterruptedException e) {
                System.out.println(this.text+" Thread Interrupted");
            }

        }
    }
}
