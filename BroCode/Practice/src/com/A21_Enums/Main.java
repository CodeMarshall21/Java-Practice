package com.A21_Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//           Enums = (Enumerations) A special kind of class that
//                   represents a fixed set of constants.
//                   They improve code readability and reliability.
//                   More efficient with switches than Strings.

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String input = in.nextLine().toUpperCase();


        try{
            Days day = Days.valueOf(input);

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
            }
        }catch(IllegalArgumentException e){
            System.out.println("INVALID INPUT");
        }


        System.out.println("All days of the week :- ");

        for(Days d : Days.values()){
            System.out.println("Day : "+d+" "+d+".ordinal() -> "+d.ordinal());
        }
        System.out.println("\n");
        for(Days d : Days.values()){
            System.out.println("Day : "+d+" "+d+".getDay() -> "+d.getDay());
        }








    }
}
