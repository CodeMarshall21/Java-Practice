package com.A9_LogicalOperators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String username;
        System.out.print("Username : ");
        username = input.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("out of range");
        }
        else if (username.contains(" ") || username.contains("_")){
            System.out.println("no special character");
        }
        else{
            System.out.printf("hello %s", username);
        }

        input.close();
    }
}
