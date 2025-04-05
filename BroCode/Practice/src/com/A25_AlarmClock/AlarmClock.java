package com.A25_AlarmClock;

import java.time.LocalTime;

public class AlarmClock implements Runnable{

    public final LocalTime alarmTime;

    AlarmClock(LocalTime alarmTime){
        this.alarmTime = alarmTime;
    }



    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);
                System.out.println(LocalTime.now());
            }catch (InterruptedException e){
                System.out.println("Thread Was Interrupted");
            }
        }
    }
}
