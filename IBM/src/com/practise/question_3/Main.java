package com.practise.question_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static int getMaximumServices(List<Integer> currentRate){

        Collections.sort(currentRate);

        Set<Integer> uniqueValues = new HashSet<>();

        for(int rate: currentRate){
            int ratePlusOne = rate + 1;
            int rateMinusOne = rate - 1;

            if(rateMinusOne > 0 && !uniqueValues.contains(rateMinusOne)){
                uniqueValues.add(rateMinusOne);
            }else if(!uniqueValues.contains(rate)){
                uniqueValues.add(rate);
            }else if(!uniqueValues.contains(ratePlusOne)){
                uniqueValues.add(ratePlusOne);
            }
        }

        return uniqueValues.size();
    }
}
