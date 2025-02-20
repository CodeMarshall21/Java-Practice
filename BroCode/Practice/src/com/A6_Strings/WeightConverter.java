package com.A6_Strings;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("1 : kgs -> lbs");
        System.out.println("2 : lbs -> kgs");
        System.out.print("Choice : ");
        choice = input.nextInt();

        if (choice == 1){
            System.out.print("kgs : ");
            weight = input.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("%.2f kgs = %.2f lbs",weight,newWeight);
        }else if (choice == 2){
            System.out.print("lbs : ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("%.2f lbs = %.2f kgs",weight,newWeight);
        }else{
            System.out.println("Invalid !");
        }
        input.close();
    }
}
