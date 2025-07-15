package com.A3_ConditionalsAndLoops;

import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int get;
        int count = 0;

        System.out.print("Number : ");
        num = input.nextInt();
        int val = num;

        System.out.print("To find : ");
        get = input.nextInt();


        while(num != 0){
            if (num % 10 == get){
                count ++;
            }
            num /= 10;
        }
        System.out.printf("\nNumber of %d's in %d is : %d",get,val,count);

        input.close();
    }
}
