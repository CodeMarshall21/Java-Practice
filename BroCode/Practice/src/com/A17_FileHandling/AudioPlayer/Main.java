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

//        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)
//        AudioSystem.getAudioInputStream(File file)
//              - Reads an audio file (like .wav, .au, .aif formats) and returns an AudioInputStream object.
//              - audioStream holds the audio data from the file, which can be used to manipulate or play the audio.

//          file → Represents the path to the audio file (sound.wav).
//          audioStream → Stores the audio data for playback.


//        Clip clip = AudioSystem.getClip()
//        AudioSystem.getClip()
//              - Creates a Clip object that can be used to play audio.
//              - A Clip is a pre-loaded audio data container that can play, stop, and loop audio.

            Clip clip = AudioSystem.getClip();
                clip.open(audioStream);

//          clip → Holds the audio data that will be played.

//          clip.open(audioStream)
//          clip.open(AudioInputStream)
//              - Loads the audio data from audioStream into the clip.
//              - The clip is now ready to play the loaded audio.


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
