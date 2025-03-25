package com.A17_FileHandling.AudioPlayer;


import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class Main {
    public static void main(String[] args) {
//        PLAY AUDIO with Java (.wav, .au, .aiff)

        String path = "D:\\Work\\Java Practise\\BroCode\\Practice\\src\\com\\A17_FileHandling\\AudioPlayer\\Fortunate Son.wav";

        File file = new File(path);

        try(Scanner in = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
                clip.open(audioStream);


                char input = '\0';

                while(input != 'Q'){
                    System.out.println("Play -> P\nStop -> S\nReset -> R\nQuit -> Q\n");
                    System.out.print("Choice: ");

                    input = Character.toUpperCase(in.next().charAt(0));


                    switch(input){
                        case 'P' -> clip.start();
                        case 'S' -> clip.stop();
                        case 'R' -> clip.setMicrosecondPosition(0);
                        case 'Q' -> clip.close();
                        default -> System.out.println("Invalid Input");
                    }
                }

        }catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported Audio File !");
        }
        catch (FileNotFoundException e) {
            System.out.println("Couldn't locate file !");
        }
        catch(IOException e){
            System.out.println("Something went Wrong !");
        }finally{
            System.out.println("Bye !");
        }


    }
}
