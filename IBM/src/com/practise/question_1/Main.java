package com.practise.question_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static List <Integer> getAllowedRequests(List<Integer> users, List<Integer> timestamp, int k){
        List<Integer> result = new ArrayList<>();
        int totalRequests = users.size();
        Map<Integer, Queue<Integer>> userHistory = new HashMap<>();

        for(int i = 0; i <= totalRequests; i++){
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

