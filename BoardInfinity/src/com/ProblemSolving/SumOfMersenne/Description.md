### **Problem Statement: Sum of Mersenne Numbers**

#### **Problem Description**
You are given an array of integers. Your task is to find the sum of all Mersenne numbers present in the array.

A **Mersenne number** is a number that can be represented in the form:  
\[
M_n = 2^n - 1
\]
where \( n \) is a positive integer.

#### **Input Format**
- The first line contains an integer `size` (\( 1 \leq size \leq 100 \)) representing the number of elements in the array.
- The next `size` lines each contain an integer (\( 1 \leq arr[i] \leq 10^6 \)) representing an element of the array.

#### **Output Format**
- Print a single integer, the sum of all Mersenne numbers in the given array.

#### **Example Input & Output**

**Input 1:**
```
Size: 5
Array: 
Element 0: 1
Element 1: 3
Element 2: 7
Element 3: 12
Element 4: 31
```
**Output 1:**
```
Sum: 42
```

**Input 2:**
```
Size: 4
Array: 
Element 0: 5
Element 1: 8
Element 2: 15
Element 3: 10
```
**Output 2:**
```
Sum: 0
```

**Input 3:**
```
Size: 1
Array:
Element 0: 127
```
**Output 3:**
```
Sum: 127
```

**Input 4:**
```
Size: 2
Array:
Element 0: 63
Element 1: 64
```
**Output 4:**
```
Sum: 63
```

#### **Explanation**
- In the first test case, the Mersenne numbers in the array are {1, 3, 7, 31}, so their sum is \( 1 + 3 + 7 + 31 = 42 \).
- In the second test case, there are no Mersenne numbers, so the sum is 0.
- In the third test case, 127 is a Mersenne number (\( 2^7 - 1 \)), so the sum is 127.
- In the fourth test case, only 63 is a Mersenne number (\( 2^6 - 1 \)), so the sum is 63.

---

This problem checks for understanding of bitwise operations and properties of Mersenne numbers. Your implementation efficiently checks whether a number follows the \( 2^n - 1 \) formula using bitwise shifts. 🚀