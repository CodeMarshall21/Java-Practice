## 🔍 Binary Search in Java - Full Guide for Future Reference

### 📌 What is Binary Search?
Binary Search is an efficient algorithm for finding an item from a **sorted list** of elements. It works by repeatedly dividing the search interval in half:
- If the target value is equal to the middle element, you found it.
- If the target is less than the middle element, continue searching in the left half.
- If the target is greater, search in the right half.

**Time Complexity:**
- Best case: \( O(1) \)
- Worst and Average case: \( O(\log n) \)

### 📚 Requirements for Binary Search
1. The data **must be sorted**.
2. You must be able to access elements using indices (like arrays or dynamic arrays).

### 🧠 Logic Behind Binary Search
1. Initialize two pointers: `low = 0`, `high = length - 1`
2. Loop while `low <= high`:
    - Calculate middle index: `middle = (low + high) / 2`
    - If `array[middle] == target`, return index.
    - If `target < array[middle]`, set `high = middle - 1`
    - Else, set `low = middle + 1`
3. If loop exits, target not found.

---

### ✅ Binary Search Example (Integer Array)
```java
public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (target < array[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1; // not found
    }
}
```

---

### 🧪 Example Usage
```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int index = BinarySearch.binarySearch(numbers, 10);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
```

---

### ⚙️ Binary Search in Your `DynamicArray`
If your `DynamicArray` stores `Object`s (e.g., `Integer`s), use:
```java
public int binarySearch(Object target) {
    int low = 0;
    int high = size - 1;

    while (low <= high) {
        int middle = (low + high) / 2;
        int midVal = (Integer) arr[middle];

        if ((Integer) target == midVal) {
            return middle;
        } else if ((Integer) target < midVal) {
            high = middle - 1;
        } else {
            low = middle + 1;
        }
    }
    return -1;
}
```

📌 Make sure all elements inserted are of `Integer` type to avoid `ClassCastException`.

---

### 🔄 Recursive Binary Search (Alternative)
```java
public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
    if (low > high) return -1;
    
    int mid = (low + high) / 2;

    if (arr[mid] == target) return mid;
    else if (target < arr[mid])
        return binarySearchRecursive(arr, target, low, mid - 1);
    else
        return binarySearchRecursive(arr, target, mid + 1, high);
}
```

---

### ⚠️ Common Mistakes to Avoid
- Applying binary search on unsorted arrays
- Integer overflow when calculating `mid = (low + high) / 2` — use `low + (high - low) / 2`
- Not updating `low` and `high` properly, causing infinite loop

---

### 🧠 When to Use Binary Search
- Searching in sorted arrays, dynamic arrays, or sorted lists
- Great for problems on LeetCode, GFG, etc., like:
    - Search Insert Position
    - Binary Search Trees
    - First/Last Occurrence
    - Rotated Sorted Array

---

### 🧪 Practice Problem Idea
Given a sorted array of integers, return the index of a target element. If not found, return -1.

**Input:** `[1, 3, 5, 7, 9, 11]`, `target = 7`  
**Output:** `3`

---
D: