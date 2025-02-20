package com.A11_VariableScope;

import java.util.Scanner;
public class Banking {
    static Scanner input = new Scanner(System.in);
    static double balance = 0;
    static int choice;
    static boolean isRunning = true;
    public static void main(String[] args) {

        while(isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch(choice){
                case 1 -> {showBalance(balance);}
                case 2 -> {balance += deposit(balance);}
                case 3 -> {balance -= withdraw(balance);}
                case 4 -> {isRunning = false;}
                default -> System.out.println("Invalid");
            }

        }
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        input.close();


    }

    static void showBalance(double balance){
        System.out.printf("\nBalance: %.2f\n\n",balance);
    }
    static double deposit(double balance){
        double amt;
        System.out.print("Deposit: ");
        amt = input.nextDouble();

        if (amt < 0){
            System.out.println("no -ve Values");
            return 0;
        }else{
            return amt;
        }
    }
    static double withdraw (double balance){
        double amt;
        System.out.print("withdraw: ");
        amt = input.nextDouble();

        if (amt < 0){
            System.out.println("no -ve Values");
            return 0;
        }else if(amt > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else{
            return amt;
        }
    }

}
