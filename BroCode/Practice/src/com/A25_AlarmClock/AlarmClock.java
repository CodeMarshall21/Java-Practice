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

                int hour = LocalTime.now().getHour();
                int minute = LocalTime.now().getMinute();
                int second = LocalTime.now().getSecond();

                System.out.printf("%02d:%02d:%02d\n",hour,minute,second);


            }catch (InterruptedException e){
                System.out.println("Thread Was Interrupted");
            }
        }
    }
}
