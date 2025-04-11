# Interpolation Search in Java

## 🧠 What is Interpolation Search?

Interpolation Search is an **improved variant of Binary Search** that works better on uniformly distributed and sorted arrays. Instead of checking the middle element (as in Binary Search), it **estimates the position** of the target based on the value range.

It’s like looking for a page in a phonebook by estimating where a name starting with "S" would be—near the end.

## 🔍 How it Works:

The idea is to calculate the probable position of the target using the formula:

```java
pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low])
```

- `low` and `high` are the indices.
- `target` is the value you're searching for.

> This formula estimates the position based on the proportion of the value range.

## 🧪 When to Use It
- Data must be **sorted**.
- Data should be **uniformly distributed** (e.g., 10, 20, 30, ..., 1000).

## 🛠️ Java Implementation
```java
public class InterpolationSearch {
    public static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high && target >= array[low] && target <= array[high]) {
            if (low == high) {
                if (array[low] == target) return low;
                return -1;
            }

            // Estimate the position
            int pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[pos] == target)
                return pos;
            if (array[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int index = interpolationSearch(arr, target);
        if (index != -1) System.out.println("Found at index: " + index);
        else System.out.println("Not Found");
    }
}
```

## 🧠 Time Complexity
- **Best Case:** O(1)
- **Average Case:** O(log log n)
- **Worst Case:** O(n) — if data isn't uniformly distributed.

## ❌ Drawbacks
- Doesn’t work well on non-uniform data.
- Division by zero risk if `array[high] == array[low]`.
- Slower than Binary Search if data is not well-distributed.

## ✅ When to Prefer
Use Interpolation Search **only if the array is sorted and values are uniformly distributed**. Otherwise, Binary Search is a safer and more general-purpose choice.

---


