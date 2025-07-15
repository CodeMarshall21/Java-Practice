package com.A3_FunctionsInJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int number;

        int choice;

        System.out.println("1 -> custom single number");
        System.out.println("2 -> custom range");
        System.out.print("Choice : ");
        choice = in.nextInt();

        switch (choice){
            case 1 -> {
                System.out.print("Number : ");
                number = in.nextInt();
                System.out.println(armCheck(number));
            }
            case 2 -> {
                System.out.print("From : ");
                int from = in.nextInt();
                System.out.print("To : ");
                int to = in.nextInt();
                System.out.printf("com.A3_FunctionsInJava.Armstrong numbers from %d to %d : ",from,to);
                for (int i = from ; i <= to ; i++){
                    if (armCheck(i)){
                        System.out.printf("%d ",i);
                    }
                }
            }


        }




    }
    static boolean armCheck(int num){
        int lastDigit;
        double sum = 0;
        double duplicate = num;
        while (num > 0){
            lastDigit = num % 10;
            sum += Math.pow(lastDigit,3);
            num /= 10;
        }
//        if (sum == duplicate){
//            return true;
//        }
//        else{
//            return false;
//        }

        return sum == duplicate;
    }
}
