package com.A12_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)

        int size;
        int choice;

        Scanner in = new Scanner(System.in);

        System.out.println("Array Size: ");
        size = in.nextInt();
        int[] nums = new int[size];

        System.out.print("Numbers: ");
        for (int num = 0; num < size; num++) {
            nums[num] = in.nextInt();
        }

        System.out.println("1 -> Sum\n2 -> Avg");
        System.out.print("Choice: ");
        choice = in.nextInt();

        switch(choice){
            case 1 -> System.out.println("Sum : "+sum(nums));
            case 2-> System.out.println("Average: "+avg(nums));
            default -> {
                System.out.println("INVALID");
            }
        }
        in.close();

    }
    static double sum(int... arr){
        int sum = 0;

        for(int number : arr) {
            sum += number;
        }

            return sum;
        }
    static double avg(int... arr){
        int sum = 0;

        for(int number : arr) {
            sum += number;
        }

        return sum / arr.length;


    }
}

