package com.A3_RandomNumbers;

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int val = 0;
        int number  = -1;

        while (val != number){
            number = random.nextInt(1,11);
            System.out.print("Number : ");
            val = input.nextInt();

            if (val != number){
                System.out.printf("WRONG !! random number is %d your number is %d\n",number,val);
            }
        }
        System.out.printf("ATLAST !! random number is %d your number is %d",number,val);


        input.close();

    }
}
