package com.StringManipulation;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String paragraph;
        int vowel = 0;
        System.out.println("Enter Paragraph:- ");
        paragraph = in.nextLine();

        String[] words = paragraph.split( "\\s+");

        for(String word : words){
            if(word.startsWith("A") || word.startsWith("a") || word.startsWith("E") || word.startsWith("e") || word.startsWith("I") || word.startsWith("i") ||
                    word.startsWith("O") || word.startsWith("o") || word.startsWith("U") || word.startsWith("u")){
                    vowel ++;
            }
        }

        System.out.println(vowel);


    }

    }

