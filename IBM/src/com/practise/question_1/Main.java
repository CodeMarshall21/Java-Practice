package com.practise.question_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<TestCases> testCases = List.of(
                new TestCases(1, List.of(1,1,1), List.of(1,70,140), 1, List.of(1,1,1)),
                new TestCases(2, List.of(1,1,1), List.of(1,20,40), 3, List.of(1,1,1)),
                new TestCases(3, List.of(1,1,1,1), List.of(10,20,30,40), 3, List.of(1,1,1,0)),
                new TestCases(4, List.of(1,1,1,1), List.of(10,20,70,80), 2, List.of(1,1,1,1)),
                new TestCases(5, List.of(1,2,1,2,1,2), List.of(1,1,2,2,3,3), 1, List.of(1,1,0,0,0,0)),
                new TestCases(6, List.of(1,1,2,1,2,2), List.of(5,10,15,20,25,30), 2, List.of(1,1,1,0,1,0)),
                new TestCases(7, List.of(1,2,1,2,1,2), List.of(10,10,11,11,12,12), 2, List.of(1,1,1,1,0,0)),
                new TestCases(8, List.of(1,1,1), List.of(0,60,120), 1, List.of(1,1,1)),
                new TestCases(9, List.of(1,1,1), List.of(0,59,119), 1, List.of(1,0,1)),
                new TestCases(10, List.of(1,2,1,1,2,1,1), List.of(1,2,3,4,5,65,66), 3, List.of(1,1,1,1,1,1,1)),
                new TestCases(11, List.of(1,2,3,1,2,3), List.of(100,100,100,160,160,160), 1, List.of(1,1,1,1,1,1)),
                new TestCases(12, List.of(1,1,1,1,1), List.of(1,2,3,4,5), 2, List.of(1,1,0,0,0)),
                new TestCases(13, List.of(1,1,1,1,1), List.of(1,2,65,130,195), 2, List.of(1,1,1,1,1)),
                new TestCases(14, List.of(1,1,1,1), List.of(0,30,60,61), 2, List.of(1,1,1,0)),
                new TestCases(15, List.of(99), List.of(9999), 5, List.of(1))
        );

        for(TestCases testCase: testCases){

            int testCaseID = testCase.getTestCaseID();
            List<Integer> users = testCase.getUsers();
            List<Integer> timestamp = testCase.getTimestamp();
            List<Integer> expected = testCase.getExpected();
            int k = testCase.getK();


            List<Integer> result = getAllowedRequests(users,timestamp,k);


            System.out.println("Test #" + testCaseID + " | k = " + k);
            System.out.println("Users:      " + users);
            System.out.println("Timestamps: " + timestamp);
            System.out.println("Expected:   " + expected);
            System.out.println("Got:        " + result);
            System.out.println(result.equals(expected) ? "✅ PASSED" : "❌ FAILED");
            System.out.println("---------------------------------------------------");
        }
    }

    public static List <Integer> getAllowedRequests(List<Integer> users, List<Integer> timestamp, int k){
        List<Integer> result = new ArrayList<>();
        int totalRequests = users.size();
        Map<Integer, Queue<Integer>> userHistory = new HashMap<>();

        for(int i = 0; i < totalRequests; i++){
            int userID = users.get(i);
            int currTS = timestamp.get(i);

            userHistory.putIfAbsent(userID, new LinkedList<>());
            Queue<Integer> userTimestamp = userHistory.get(userID);

            int windowStart = currTS - 60;

            while(!userTimestamp.isEmpty() && userTimestamp.peek() <= windowStart){
                userTimestamp.poll();
            }

            if(userTimestamp.size() < k){
                result.add(1);
                userTimestamp.offer(currTS);
            }else{
                result.add(0);
            }
        }
        return result;
    }
}

