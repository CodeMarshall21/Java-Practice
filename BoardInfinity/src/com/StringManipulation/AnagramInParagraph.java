package com.StringManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramInParagraph {
    public static void main(String[] args) {
        String paragraph;
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.println("Paragraph:- ");
        paragraph = in.nextLine();

        String[] words = paragraph.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(isAnagram(words[i],words[j])){
                    count++;
                }
            }

        }

        System.out.println("Number of Pairs: "+count);
    }

    static boolean isAnagram(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}
