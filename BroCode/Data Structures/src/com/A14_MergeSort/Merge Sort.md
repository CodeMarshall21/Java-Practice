# Merge Sort in Java - Final Guide

## ✨ Overview
Merge Sort is a **Divide and Conquer** algorithm that recursively splits an array into halves, sorts them, and merges them back together.

- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Stable Sort**: Yes
- **In-place**: No (uses extra memory)

---

## ⚙️ Core Logic

1. **Divide** the array into two halves.
2. **Recursively** sort each half.
3. **Merge** the sorted halves into a single sorted array.

---

## 📄 Code Walkthrough

```java
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 4, 7, 6, 1};
```
- Input array to be sorted.

```java
        System.out.print("Array: ");
        for(int val :arr){
            System.out.print(val + " ");
        }
```
- Print original array.

```java
        System.out.println("\nSorting...");
        mergeSort(arr);
```
- Call to recursive `mergeSort` function.

```java
        System.out.print("Sorted Array: ");
        for(int val :arr){
            System.out.print(val + " ");
        }
    }
```
- Print the sorted array.

---

## 🧠 `mergeSort` Method
```java
public static void mergeSort(int[] array){
```
- Entry point to sort array recursively.

```java
    int arrayLength = array.length;
    if (arrayLength <= 1){
        return;
    }
```
- Base case: an array of size 0 or 1 is already sorted.

```java
    int middle = (arrayLength / 2);
    int [] leftArray = new int[middle];
    int [] rightArray = new int[arrayLength - middle];
```
- Create two arrays: `leftArray` and `rightArray`.

```java
    int i = 0;
    int j = 0;

    for (; i < arrayLength; i++) {
        if (i < middle){
            leftArray[i] = array[i];
        }else{
            rightArray[j] = array[i];
            j++;
        }
    }
```
- Copy data to `leftArray` and `rightArray`.

```java
    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
```
- Recursively sort and merge.

---

## ⚔️ `merge` Method
```java
public static void merge (int[] leftArray, int[] rightArray, int[] array){
```
- Merges two sorted arrays into the original array.

```java
    int i = 0, j = 0, k = 0;
    int leftLength = leftArray.length;
    int rightLength = rightArray.length;
```
- Index pointers for `leftArray`, `rightArray`, and merged `array`.

```java
    while(i < leftLength && j < rightLength){
        if (leftArray[i] < rightArray[j]){
            array[k] = leftArray[i];
            i++;
        } else {
            array[k] = rightArray[j];
            j++;
        }
        k++;
    }
```
- Compare and merge elements in sorted order.

```java
    while (i < leftLength){
        array[k++] = leftArray[i++];
    }
    while (j < rightLength){
        array[k++] = rightArray[j++];
    }
```
- Append remaining elements from either array (only one loop will execute).

---

## 📊 Dry Run (Input: [8, 2, 5, 3])

1. Split: [8, 2] and [5, 3]
2. [8, 2] -> [8], [2] => merge -> [2, 8]
3. [5, 3] -> [5], [3] => merge -> [3, 5]
4. Final merge: [2, 8] and [3, 5] => [2, 3, 5, 8]

---

## 🔄 Time and Space Analysis

| Case         | Time Complexity |
|--------------|-----------------|
| Best Case    | O(n log n)      |
| Average Case | O(n log n)      |
| Worst Case   | O(n log n)      |

- **Space Complexity**: O(n) due to extra arrays used for merging.

---

## 📈 When to Use Merge Sort?
- When **stable sort** is needed.
- When **consistent time complexity** is more important than space.
- Ideal for **linked lists** (can be done in-place).

---

## 🔄 Summary
- Recursively splits arrays.
- Sorts and merges them.
- Always O(n log n).
- Not in-place (uses extra memory).
- One of the most efficient and reliable sorting algorithms.

---