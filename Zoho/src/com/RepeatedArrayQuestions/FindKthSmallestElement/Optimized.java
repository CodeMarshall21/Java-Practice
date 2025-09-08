package com.RepeatedArrayQuestions.FindKthSmallestElement;

import java.util.Collections;
import java.util.PriorityQueue;

public class Optimized {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println(kthSmallestElementOptimized(arr, k));

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
