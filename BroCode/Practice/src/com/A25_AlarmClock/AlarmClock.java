package com.A25_AlarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    public final LocalTime alarmTime;
    public final String filepath;
    public final Scanner in;

    AlarmClock(LocalTime alarmTime, String filepath, Scanner in){
        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.in = in;
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
//        System.out.println("\n*ALARM NOISES ! *");
        playSound(filepath);
    }

    private void playSound(String filepath){
        File audioFile = new File(filepath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("\nHit *ENTER* to stop alarm : -");
            in.nextLine();
            clip.stop();
            in.close();

        }catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported Audio File");
        }catch(IOException e){
            System.out.println("IOException");
        } catch (LineUnavailableException e) {
            System.out.println("Line Unavailable");
        }
    }
}
