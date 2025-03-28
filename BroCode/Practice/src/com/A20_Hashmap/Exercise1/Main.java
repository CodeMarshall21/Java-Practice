package com.A20_Hashmap.Exercise1;

import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        HashMap<String,Double> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        double totalExpense = 0;
        double savings = 0;

        System.out.print("Enter Your Monthly Income : $");
        double income = in.nextDouble();

        in.nextLine();

        while(true){
            System.out.print("Enter the category of expense (or 'done' to finish): ");
            String category = in.nextLine();
            if(category.equals("done")){
                break;
            }else {
                System.out.print("Enter the Expense: $");
                double expense = in.nextDouble();
                totalExpense += expense;
                map.put(category, expense);
                in.nextLine();
            }
        }
        savings = income - totalExpense;
        System.out.println("\nTotal Financial Summary:- ");
        System.out.println("Total Income: $"+income);
        System.out.println("Total Spendings: $"+totalExpense);
        System.out.println("Savings: $"+savings);
        System.out.println("\nCategory Wise Expenses:- ");
        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }



    }
}
