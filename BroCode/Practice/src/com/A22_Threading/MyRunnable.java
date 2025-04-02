package com.A22_Threading;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i <= 10; i++) {
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("THREAD INTERRUPTED");
            }
            if(i == 10){
                System.out.println("TIME'S UP!");
                System.exit(0);                     //      <- To exit the main thread as well
            }
        }

    }
}
