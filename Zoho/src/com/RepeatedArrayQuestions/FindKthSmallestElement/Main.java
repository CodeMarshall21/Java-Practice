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

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println(kthSmallestElementOptimized(arr, k));

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

    private static int kthSmallestElementOptimized(int[] arr, int k) {
        if (k > arr.length || k == 0) {
            return -1;
        }

        // Max-Heap of size k
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            if (maxHeap.size() < k) {
                maxHeap.add(num);
            } else if (num < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(num);
            }
        }

        return maxHeap.peek();
    }
}
