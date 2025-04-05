package com.A25_AlarmClock;

import java.time.LocalTime;

public class AlarmClock implements Runnable{

    public final LocalTime alarmTime;
    public final String filepath;

    AlarmClock(LocalTime alarmTime, String filepath){
        this.alarmTime = alarmTime;
        this.filepath = filepath;
    }





    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                

                System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());


            }catch (InterruptedException e){
                System.out.println("Thread Was Interrupted");
            }
        }
        System.out.println("\n*ALARM NOISES ! *");
    }
}
