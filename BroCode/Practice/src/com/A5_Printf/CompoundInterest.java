package com.A5_Printf;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // a = p(1+(r/n))^nt

        double amount;
        double principal;
        double RateOfInterest;
        int NumberOfTimes;
        int years;

        System.out.print("Principal : ");
        principal = input.nextDouble();

        System.out.print("Rate Of Interest in % : ");
        RateOfInterest = input.nextDouble() / 100;

        System.out.print("Number Of Years : ");
        NumberOfTimes = input.nextInt();

        System.out.print("Times Compounded : ");
        years = input.nextInt();

        amount = principal* Math.pow((1+(RateOfInterest/NumberOfTimes)), NumberOfTimes*years);

        System.out.printf("Amount after %d years is ₹%.2f", years,amount);

        input.close();
    }
}
