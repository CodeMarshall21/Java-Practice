# Insertion Sort in Java - Clear Explanation with Dry Run

---

## What is Insertion Sort?

Insertion Sort is a simple sorting algorithm that works similarly to how we sort playing cards in our hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

- **Best Case Time Complexity**: O(n) — already sorted
- **Worst Case Time Complexity**: O(n^2) — reverse order
- **Stable Sort**: Yes
- **In-place Sort**: Yes (no extra memory needed)

---

## Insertion Sort Java Code:
```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];            // element to be inserted
            int j = i - 1;

            // Shift elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;  // place the key in its correct location
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

---

## Dry Run:
### Input: `{9, 5, 1, 4, 3}`

```
Initial array: [9, 5, 1, 4, 3]

Pass 1 (i=1):
Key = 5, compare with 9
[9, 9, 1, 4, 3]  → 5 is inserted before 9
Result: [5, 9, 1, 4, 3]

Pass 2 (i=2):
Key = 1, compare with 9, 5
[5, 9, 9, 4, 3] → [5, 5, 9, 4, 3]
Insert 1 at beginning
Result: [1, 5, 9, 4, 3]

Pass 3 (i=3):
Key = 4, compare with 9, 5
[1, 5, 9, 9, 3] → [1, 5, 5, 9, 3]
Insert 4 in correct place
Result: [1, 4, 5, 9, 3]

Pass 4 (i=4):
Key = 3, compare with 9, 5, 4
[1, 4, 5, 9, 9] → [1, 4, 5, 5, 9] → [1, 4, 4, 5, 9]
Insert 3
Result: [1, 3, 4, 5, 9]
```

---

## Final Sorted Array:
```
[1, 3, 4, 5, 9]
```

---

## When to Use:
- Small datasets
- Almost sorted arrays
- Easy to implement and understand

---