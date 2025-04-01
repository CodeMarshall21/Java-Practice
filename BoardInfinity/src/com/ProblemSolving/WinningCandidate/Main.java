package com.ProblemSolving.WinningCandidate;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String input;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Input: ");
        input = in.nextLine();
        int candidateSize = Integer.parseInt(input.substring(0,1));

        char[] candidates = new char[candidateSize];

        for (int i = 0; i < candidateSize; i++) {
            candidates[i] = input.charAt(i+2);
        }

        
        
    }
}
