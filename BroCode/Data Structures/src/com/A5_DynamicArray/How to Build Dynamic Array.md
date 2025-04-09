# Explanation of DynamicArray.java

This document explains each part of the `DynamicArray` class implemented in Java to mimic the behavior of Java's built-in `ArrayList`.

---

## 1. Class and Variables
```java
public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] arr;
```
- `size`: Tracks how many elements are currently in the array.
- `capacity`: The maximum number of elements the array can hold before resizing. Defaults to 10.
- `arr`: The underlying array of type `Object[]` to store elements.

---

## 2. Constructors
```java
public DynamicArray() {
    this.arr = new Object[capacity];
}
```
- Default constructor initializes the array with the default `capacity` (10).

```java
public DynamicArray(int capacity) {
    this.capacity = capacity;
    this.arr = new Object[capacity];
}
```
- Overloaded constructor that allows specifying an initial capacity.

---

## 3. `get(int index)`
```java
public Object get(int index) {
    return arr[index];
}
```
- Returns the object at the specified index.

---

## 4. `add(Object data)`
```java
public void add(Object data) {
    if (size >= capacity) {
        grow();
    }
    arr[size] = data;
    size++;
}
```
- Adds an element to the end of the array.
- Automatically grows the array if it's full.

---

## 5. `insert(int index, Object data)`
```java
public void insert(int index, Object data) {
    if (size >= capacity) {
        grow();
    }
    for (int i = size; i > index; i--) {
        arr[i] = arr[i - 1];
    }
    arr[index] = data;
    size++;
}
```
- Inserts an element at a specified index.
- Shifts all elements to the right starting from the index.

---

## 6. `delete(Object data)`
```java
public void delete(Object data) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == data) {
            for (int j = i; j < size; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = null;
            size--;
            if (size <= capacity / 3) {
                shrink();
            }
            break;
        }
    }
}
```
- Deletes the first occurrence of the specified element.
- Shifts remaining elements left.
- Shrinks array if it's underutilized.

---

## 7. `search(Object data)`
```java
public int search(Object data) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == data) {
            return i;
        }
    }
    return -1;
}
```
- Searches for the element and returns its index or -1 if not found.

---

## 8. `grow()`
```java
private void grow() {
    int newCapacity = capacity * 2;
    Object[] newArr = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
        newArr[i] = arr[i];
    }

    capacity = newCapacity;
    arr = newArr;
}
```
- Doubles the capacity when the array is full.
- Copies existing elements to the new larger array.

---

## 9. `shrink()`
```java
private void shrink() {
    int newCapacity = capacity / 2;
    Object[] newArr = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
        newArr[i] = arr[i];
    }

    capacity = newCapacity;
    arr = newArr;
}
```
- Reduces capacity by half when size becomes one-third or less of the capacity.
- Helps save memory.

---

## 10. `isEmpty()`
```java
public boolean isEmpty() {
    return size == 0;
}
```
- Returns `true` if the array has no elements.

---

## 11. `toString()`
```java
public String toString() {
    String string = "";
    for (Object data : arr) {
        string += data + ", ";
    }
    if (!string.isEmpty()) {
        string = "[" + string.substring(0, string.length() - 2) + "]";
    } else {
        string = "[]";
    }
    return string;
}
```
- Converts the contents of the array to a formatted string.
- Removes the trailing comma and space.

---

## Summary
This `DynamicArray` class provides basic functionality of an array list, including dynamic resizing, inserting, deleting, and searching. The use of `Object[]` allows generic storage, although in real-world applications, you would use generics to avoid typecasting issues.

