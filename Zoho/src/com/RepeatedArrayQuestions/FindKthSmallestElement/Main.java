package com.RepeatedArrayQuestions.FindKthSmallestElement;


/*
        Find Kth Smallest Element
        Description:
        Given an unsorted array and a number k, find the kth smallest
        element without modifying array.

        Input:
        arr = [7, 10, 4, 3, 20, 15]
        k = 3

        Output: 7
*/

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

    }

    private static int kthSmallestElement(int[] arr, int k) {
        if (k > arr.length || k == 0) {
            return -1;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
