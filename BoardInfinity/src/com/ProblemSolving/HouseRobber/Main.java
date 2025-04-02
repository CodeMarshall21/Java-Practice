//package com.ProblemSolving.HouseRobber;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] houses = {2,7,9,3,1};
//        System.out.println("Houses: "+ Arrays.toString(houses));
//
//        int totalProfit = robber(houses);
//        System.out.println("Total Profit: "+totalProfit);
//    }
//
//    public static int robber(int[] houses){
//        int oddSum = 0;
//        int evenSum = 0;
//
//        for (int i = 0; i < houses.length; i=i+2) {
//            evenSum += houses[i];
//        }
//
//        for (int i = 1; i < houses.length; i=i+2) {
//            oddSum += houses[i];
//        }
//        return Math.max(oddSum,evenSum);
//
//    }
//}
