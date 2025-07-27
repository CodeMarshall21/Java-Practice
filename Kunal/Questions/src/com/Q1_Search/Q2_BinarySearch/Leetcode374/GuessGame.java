package com.Q1_Search.Q2_BinarySearch.Leetcode374;

public class GuessGame {
    int guessVal;

    public GuessGame(int guessVal){
        this.guessVal = guessVal;
    }

    public int guess(int num){
        int val;

        if (num > guessVal){
            val = -1;
        }
        else if(num < guessVal){
            val = 1;
        }
        else{
            val = 0;
        }

        return val;

    }
}
