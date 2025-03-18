package com.StringManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1;
        String word2;

        System.out.print("Word 1: ");
        word1 = in.nextLine();
        System.out.println();
        System.out.print("Word 2: ");
        word2 = in.nextLine();

        System.out.println("isAnagram: " + isSorted(word1,word2));

    }

    static boolean isSorted (String word1,String word2){
       char[] charArray1 = word1.toCharArray();
       char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

       return Arrays.equals(charArray1,charArray2);
    }
}
