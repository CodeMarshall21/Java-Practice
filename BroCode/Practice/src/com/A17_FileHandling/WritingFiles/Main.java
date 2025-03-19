package com.A17_FileHandling.WritingFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        Scanner in = new Scanner(System.in);

        String filePath = "D:\\Work\\Java Practise\\BroCode\\Practice\\src\\com\\A17_FileHandling\\WritingFiles\\text.txt";
        String fileContent = "";

        try{
            System.out.println("Enter Text Below:- ");
            String fileContents = in.nextLine();
            fileContent += fileContents;
        }catch(InputMismatchException e){
            System.out.println("Enter Proper Text !!");
        }finally {
            in.close();
        }


        try(FileWriter writing = new FileWriter(filePath)){
            writing.write(fileContent);
            System.out.println("File Written");
        }catch (FileNotFoundException e){
            System.out.println("COULD NOT Locate File");
        }
        catch (IOException e) {
            System.out.println("COULD NOT Write File");
        }

    }
}
