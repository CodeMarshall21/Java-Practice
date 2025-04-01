### **Problem Statement: Find the Longest Palindromic Substring**

#### **Problem Description**
Given a string, find the longest contiguous substring that is a palindrome. A palindrome is a sequence of characters that reads the same forward and backward.

#### **Input Format**
- A single string **str** of lowercase or uppercase English letters.

#### **Output Format**
- A single string representing the longest palindromic substring in **str**.

#### **Example Input & Output**

**Input 1:**
```
bababababd
```
**Output 1:**
```
babababab
```
**Explanation:**  
The longest palindromic substring in `"bababababd"` is `"babababab"`.

---

**Input 2:**
```
racecarxyz
```
**Output 2:**
```
racecar
```
**Explanation:**  
The longest palindromic substring in `"racecarxyz"` is `"racecar"`.

---

**Constraints:**
- \( 1 \leq \) length of **str** \( \leq 1000 \).
- The input contains only English letters (both lowercase and uppercase).

#### **Approach Used in Code:**
1. The algorithm iterates through each character in the string.
2. It expands outward from the character (odd-length palindrome case) and from the space between two characters (even-length palindrome case).
3. It keeps track of the longest palindrome found.
4. Finally, it prints the longest palindromic substring.

This problem helps in understanding **two-pointer techniques** and **string expansion** efficiently. 🚀