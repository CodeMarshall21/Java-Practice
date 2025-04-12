# 🌀 Quick Sort - Your Ultimate & Final Guide

## 📌 What is Quick Sort?
Quick Sort is a **Divide and Conquer** sorting algorithm that:
- Picks a **pivot** element.
- Partitions the array so that:
    - All elements **less than** pivot go to the **left**.
    - All elements **greater than or equal to** pivot go to the **right**.
- Recursively repeats the process on the left and right subarrays.

---

## 🧠 Time and Space Complexity
| Case | Time Complexity |
|------|------------------|
| Best | O(n log n)       |
| Average | O(n log n)    |
| Worst | O(n²) - when array is already sorted and pivot is the smallest/largest |

| Type | Space Complexity |
|------|------------------|
| Worst Case | O(log n) (recursive stack) |

---

## 🔧 Key Concepts
### 1. **Pivot Selection**
- You can choose the pivot in many ways:
    - Last element (most common & simple)
    - First element
    - Median of three

### 2. **Partitioning**
- Reorganize elements such that:
    - All elements < pivot are to the left
    - Pivot is placed at its correct sorted position

### 3. **Recursion**
- Call `quickSort` on left and right of pivot index

---

## 🔍 How It Works (Step-by-Step)
Given:
```java
int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
```

### Step 1: Choose Pivot
- Pivot = last element = `1`
- Move smaller elements to the left and finally place pivot in its correct place.
- After partition: `{1, 2, 5, 3, 9, 4, 7, 6, 8}`

Pivot is now at the correct index `0`.

### Step 2: Recursively apply QuickSort on left and right subarrays
- Left = `[]` (base case, do nothing)
- Right = `{2, 5, 3, 9, 4, 7, 6, 8}`

Repeat the same process for right subarray.

---

## 🔄 Dry Run
```java
int[] array = {5, 3, 8, 4, 2, 7, 1, 10};
```
1. Choose pivot = 10
2. All values < 10 get pushed left
3. Swap pivot (10) to position 7

Now pivot is at correct position. Recurse on:
- Left = {5, 3, 8, 4, 2, 7, 1}
- Right = []

Next pivot = 1 (last element of left)
Rearrange elements < 1 to left of it => `{1, 3, 8, 4, 2, 7, 5}`

Continue recursively...

---

## 🧪 Dry Run Example

Input Array: `[8, 2, 5, 3, 9, 4, 7, 6, 1]`

### Step 1: First Call `quickSort(array, 0, 8)`
- Pivot = `1` (last element)
- Partitioning: All elements > 1 so no swaps until last
- Swap `1` with `8` → Array: `[1, 2, 5, 3, 9, 4, 7, 6, 8]`
- Pivot index = 0

### Step 2: Recurse on Left and Right
- Left side: `[]` (no element, returns)
- Right side: `[2, 5, 3, 9, 4, 7, 6, 8]`

Repeat similar steps with new pivot `8`, `6`, etc., until entire array is sorted.

---

## 🔍 Step-by-Step Code Explanation
```java
private static void quickSort(int[] array, int start, int end) {
    if (end <= start) return; // base case

    int pivot = partition(array, start, end); // partition step

    // recursively sort elements before and after partition
    quickSort(array, start, pivot - 1);
    quickSort(array, pivot + 1, end);
}
```

- **Base case**: If start >= end, it means the array (or sub-array) is sorted.
- **partition()**: Reorganizes the array so that:
    - All elements < pivot are before it
    - All elements > pivot are after it

```java
private static int partition(int[] array, int start, int end) {
    int pivot = array[end];
    int i = start - 1; // boundary for smaller elements

    for (int j = start; j <= end; j++) {
        if (array[j] < pivot) {
            i++;
            // swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    // finally place pivot at its correct sorted position
    i++;
    int temp = array[i];
    array[i] = array[end];
    array[end] = temp;

    return i; // pivot index
}
```

---

## 🧾 When To Use Quick Sort?
- When you want a fast in-place sort
- Great for large datasets
- Use carefully on already sorted or nearly sorted arrays (can degrade to O(n^2))

---

## 💬 Final Tip
> Quick Sort is one of the fastest and most efficient sorting algorithms used in practice. Understanding partitioning is key. Always test edge cases and observe recursion behavior.

