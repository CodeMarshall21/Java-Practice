# 🧠 Bubble Sort - Deep Dive Explanation

## 🧾 What is Bubble Sort?
Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

> Think of it as the heaviest elements "bubbling" up to the end with each pass.

---

## 🧮 How It Works (Logic)
1. Start from the first element.
2. Compare the current element with the next.
3. If current > next, **swap** them.
4. Move to the next pair and repeat.
5. At the end of the pass, the largest element is at the last index.
6. Repeat the process for the remaining unsorted portion of the array.

> After N-1 passes (where N is the array length), the array is sorted.

---

## 🔁 Pseudocode
```java
for i from 0 to n-1
    for j from 0 to n-i-1
        if array[j] > array[j + 1]
            swap(array[j], array[j + 1])
```

---

## 💻 Java Code Example
```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

## ⚙️ Time Complexity
| Case       | Comparisons |
|------------|-------------|
| Best       | O(n)        | (when already sorted)
| Average    | O(n^2)      |
| Worst      | O(n^2)      |

---

## 📦 Space Complexity
- O(1) – in-place sorting (no extra space used)

---

## ✅ Pros
- Simple to understand and implement
- Good for small datasets

## ❌ Cons
- Inefficient on large datasets
- High time complexity (n^2)

---

## 📌 Notes
- The optimized version with the `swapped` flag helps avoid unnecessary passes.
- Bubble Sort is **stable** (does not change the relative order of equal elements).

---
