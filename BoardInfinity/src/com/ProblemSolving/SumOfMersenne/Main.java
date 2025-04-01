package com.ProblemSolving.SumOfMersenne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Size: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Element %d: ",i);
            arr[i] = in.nextInt();
        }

        for(int val: arr){
            if(isMersenne(val)){
                sum += val;
            }
        }
        System.out.println("Sum: "+sum);

    }
    static boolean isMersenne(int val){
//        int[] mersenne = new int[10];
//
//        for (int i = 1; i < 10; i++) {
//            mersenne[i-1] = ((int)Math.pow(2,i)) - 1;
//        }
//
//        for(int num:mersenne){
//            if (val == num){
//                return true;
//            }
//        }
//        return false;
        int i = 1;
        while(val >= (1 << i)-1){
            if ((1 << i) - 1 == val){
                return true;
            }
            i ++;
        }
        return false;

    }
}
