# 📘 Selection Sort in Java - Complete Explanation

---

## 🔍 What is Selection Sort?
Selection Sort is a simple **comparison-based** sorting algorithm. It divides the input array into two parts: the **sorted part at the front** and the **unsorted part at the back** of the array. It repeatedly **selects the minimum element** from the unsorted part and moves it to the end of the sorted part.

---

## ⚙️ How it Works (Step-by-Step)

1. Start from the first element (index 0).
2. Find the smallest element in the rest of the array (from index 1 to end).
3. Swap the first element with the smallest element found.
4. Move to the next index and repeat steps 2–3 until the array is sorted.

---

## 🧠 Key Characteristics
| Property            | Value                    |
|---------------------|---------------------------|
| Time Complexity     | O(n^2)                    |
| Space Complexity    | O(1) (in-place)           |
| Stable              | ❌ (Not stable)           |
| Adaptive            | ❌ (Does not adapt)       |
| Best Case           | O(n^2)                    |
| Worst Case          | O(n^2)                    |
| Use Case            | When simplicity is okay   |

---

## 💡 Java Implementation
```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the current element with the smallest element found
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

---

## 🔄 Dry Run Example
Array: `[64, 25, 12, 22, 11]`

1. Find min from index 0 to 4 → min = 11 → Swap with index 0 → `[11, 25, 12, 22, 64]`
2. Find min from index 1 to 4 → min = 12 → Swap with index 1 → `[11, 12, 25, 22, 64]`
3. Find min from index 2 to 4 → min = 22 → Swap with index 2 → `[11, 12, 22, 25, 64]`
4. Find min from index 3 to 4 → already sorted

Final Result: `[11, 12, 22, 25, 64]`

---

## ❗ Important Notes
- Inefficient for large datasets.
- Always performs n(n-1)/2 comparisons regardless of input.
- No extra memory is used (in-place).
- Not ideal for nearly sorted arrays.

---

## ✅ When to Use
- When memory is limited.
- When a simple implementation is okay.
- For educational purposes.

---