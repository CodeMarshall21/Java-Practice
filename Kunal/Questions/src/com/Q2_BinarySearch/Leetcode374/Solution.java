package com.Q2_BinarySearch.Leetcode374;

public class Solution extends GuessGame {
    public Solution(int guessVal) {
        super(guessVal);
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    static int guessNumber(int n) {
        GuessGame guessGame = new GuessGame(6);

        int left = 1;
        int right = n;

        while (left <= right){
            int mid = left + (right - left) / 2;
            int outcome = guessGame.guess(mid);

            if (outcome == 0){
                return mid;
            }
            else if(outcome == 1){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }
        return -1;
    }
}
