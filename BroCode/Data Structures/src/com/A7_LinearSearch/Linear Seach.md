# Linear Search in Java

## What is Linear Search?
Linear search (also known as sequential search) is the simplest search algorithm. It checks every element in a list sequentially until the desired element is found or the list ends.

## When to Use Linear Search
- The dataset is unsorted
- The dataset is small
- You don't need high performance
- Simplicity is preferred

## How It Works
1. Start from the first element.
2. Compare the current element with the target value.
3. If it matches, return the index.
4. If it doesn't, move to the next element.
5. Repeat steps 2-4 until the end of the array.
6. If the element is not found, return -1.

## Time Complexity
- **Best Case:** O(1) – if the element is at the beginning.
- **Worst Case:** O(n) – if the element is at the end or not present.
- **Average Case:** O(n)

## Space Complexity
- O(1) – constant space is used.

## Code Example
```java
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 2, 9, 1};
        int target = 2;

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
```

## Key Points
- Simple and intuitive
- Doesn’t require sorted input
- Inefficient on large datasets

## Pros and Cons
**Pros:**
- Easy to implement
- Works on unsorted arrays

**Cons:**
- Inefficient for large datasets
- Slower than binary search on sorted data

## Real-world Analogy
Imagine looking for a book on a shelf where the books are not arranged in any particular order. You check each book one by one until you find the one you want. That's how linear search works.

## When *Not* to Use Linear Search
- If your array is large and/or sorted – use binary search instead.
- When performance is a priority.

## Conclusion
Linear search is a fundamental and easy-to-understand algorithm, great for beginners and small datasets, but not suitable for high-performance needs.