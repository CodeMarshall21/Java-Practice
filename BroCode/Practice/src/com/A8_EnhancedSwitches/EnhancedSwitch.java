package com.A8_EnhancedSwitches;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements
        //                                   (Java14 feature)

        Scanner input = new Scanner(System.in);

        String day;

        System.out.print("Enter a day : ");
        day = input.nextLine();

        switch (day){
            case "monday" , "tuesday" , "wednesday" , "thursday" , "friday" -> System.out.println("Weekday");
            case "saturday" , "sunday" -> System.out.println("Weekend");
            default -> System.out.printf("%s is not a day", day);
        }

        input.close();
    }
}
