package com.practise.question_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        runTest("Example from image", Arrays.asList(4, 1, 4, 1, 4, 1), 5);
        runTest("All duplicates (simple)", Arrays.asList(5, 5, 5), 3);
        runTest("All duplicates (edge case)", Arrays.asList(1, 1, 1), 2);
        runTest("Densely packed (collision)", Arrays.asList(2, 2, 2, 3), 4);
        runTest("Already unique", Arrays.asList(10, 20, 30), 3);
        runTest("Mixed collision", Arrays.asList(100, 100, 101, 102, 102), 5);
        runTest("Complex mixed bag", Arrays.asList(5, 3, 1, 5, 3, 8), 6);
        runTest("Single element", Arrays.asList(42), 1);
        runTest("Single element (edge case)", Arrays.asList(1), 1);
        runTest("Empty list", Arrays.asList(), 0);

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

    // Helper function to format test output
    public static void runTest(String testName, List<Integer> input, int expected) {
        // Create a new ArrayList to avoid modifying the original test case list
        List<Integer> inputCopy = new ArrayList<>(input);
        int actual = getMaximumServices(inputCopy);
        System.out.println("--- Test: " + testName + " ---");
        System.out.println("Input:    " + input);
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        System.out.println(actual == expected ? "Result:   PASS" : "Result:   FAIL");
        System.out.println();
    }
}
