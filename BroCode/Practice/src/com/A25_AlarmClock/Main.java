package com.A25_AlarmClock;

import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filepath = "D:\\Work\\Java Practise\\BroCode\\Practice\\src\\com\\A25_AlarmClock\\Fortunate Son.wav";

        while(alarmTime == null){
            try{
                System.out.print("Alarm Time (HH:MM:SS) : ");
                String inputTime = in.nextLine();

                alarmTime = LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for " + alarmTime);
            }catch(DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime,filepath,in);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
