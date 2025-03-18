package com.ProblemSolving.RingTossBooth;


import java.util.Arrays;
import java.util.Scanner;

public class RingTossBooth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[10];

        int max1 = -1;
        int max2 = -1;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

         System.out.print("values:");
         for (int i = 0; i < scores.length; i++) {
             scores[i] = in.nextInt();
         }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max1){
                max2 = max1;
                max1 = scores[i];

            }else if((max1 > scores[i]) && (scores[i] > max2)){
                max2 = scores[i];
            }
            if (scores[i] < min1){
                min2 = min1;
                min1 = scores[i];

            }else if((min1 < scores[i]) && (scores[i] < min2)){
                min2 = scores[i];
            }

        }

        System.out.printf("\nmax1: %d,max2: %d,min1: %d,min2: %d\n",max1,max2,min1,min2);

        int val = max2 - min2;

        System.out.println(val);
        System.out.println(Arrays.toString(scores));
        if (isPrime(val)){
            System.out.println("Win");
        }else{
            System.out.println("Lose");
        }


    }

    static boolean isPrime(int val){
        for (int i = 2; i < Math.sqrt(val); i++) {
            if ((val % i) == 0){
                return false;
            }
        }
        return true;
    }
}