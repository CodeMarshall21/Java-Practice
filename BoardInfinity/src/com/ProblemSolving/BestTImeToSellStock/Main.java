package com.ProblemSolving.BestTImeToSellStock;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] stockPrice = {7,1,5,3,6,4};
        System.out.println("Stocks: "+ Arrays.toString(stockPrice));
        int day = bestDay(stockPrice);
        System.out.println("Highest Profit: "+day);
    }

    public static int bestDay(int [] stockPrice){
        int minPrice = stockPrice[0];
        int maxProfit = 0;
        int currProfit;
        for (int price : stockPrice){
            if (price < minPrice){
                minPrice = price;
            }
            currProfit = price - minPrice;
            maxProfit = Math.max(currProfit,maxProfit);
        }

        return maxProfit;
    }
}
