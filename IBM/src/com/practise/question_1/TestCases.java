package com.practise.question_1;

import java.util.List;

public class TestCases {
    private int testCaseID;
    private List<Integer> users;
    private List<Integer> timestamp;
    private List<Integer> expected;
    private int k;

    public TestCases(int testCaseID, List<Integer> users, List<Integer> timestamp, int k, List<Integer> expected) {
        this.testCaseID = testCaseID;
        this.users = users;
        this.timestamp = timestamp;
        this.expected = expected;
        this.k = k;
    }

    public int getTestCaseID() {
        return testCaseID;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public List<Integer> getTimestamp() {
        return timestamp;
    }

    public List<Integer> getExpected() {
        return expected;
    }

    public int getK() {
        return k;
    }
}
