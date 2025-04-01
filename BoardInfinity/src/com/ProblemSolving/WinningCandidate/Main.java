package com.ProblemSolving.WinningCandidate;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        String input;
        HashMap<Character,Integer> map = new HashMap<>();


        Scanner in = new Scanner(System.in);

        System.out.print("Input: ");
        input = in.nextLine();
        int candidateSize = Integer.parseInt(input.substring(0,1));

        char[] candidates = new char[candidateSize];

        for (int i = 0; i < candidateSize; i++) {
            candidates[i] = input.charAt(i+2);
        }
        System.out.print("Total Candidates: "+Arrays.toString(candidates));

        System.out.print("\nLocation Wise Result: ");
        String result = in.nextLine();

        char [] resArr = result.toCharArray();

        for (char ch: resArr){
            if (ch == ' '){
                continue;
            }else{
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        int max = -1;
        char winningCandidate = ' ';

        for(char key: map.keySet()){
            if (map.get(key) > max){
                max = map.get(key);
                winningCandidate = key;
            }
        }
        System.out.println("Results: "+map);
        System.out.println("Winning Candidate: "+ winningCandidate);


        
    }
}
