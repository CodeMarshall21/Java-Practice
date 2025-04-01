### **Problem Statement: Anagram Checker**

#### **Problem Description**
You are given two words. Your task is to determine whether the two words are **anagrams** of each other.  
Two words are anagrams if they contain the same characters in the same frequency but in any order.

#### **Input Format**
- A single string **word1**.
- A single string **word2**.

#### **Output Format**
- `true` if the two words are anagrams.
- `false` otherwise.

---

#### **Example Input & Output**

**Input 1:**
```
Word 1: listen  
Word 2: silent  
```
**Output 1:**
```
isAnagram: true
```
**Explanation:**
- "listen" and "silent" contain the same characters, just in a different order.

---

**Input 2:**
```
Word 1: hello  
Word 2: world  
```
**Output 2:**
```
isAnagram: false
```
**Explanation:**
- "hello" and "world" do not contain the same set of characters.

---

**Input 3:**
```
Word 1: racecar  
Word 2: carecar  
```
**Output 3:**
```
isAnagram: true
```
**Explanation:**
- Both words contain the same characters in the same frequency.

---

### **Constraints**
- \( 1 \leq \) length of **word1, word2** \( \leq 1000 \).
- The words consist of lowercase English letters only.

This problem helps in understanding **sorting**, **string manipulation**, and **array comparison**. 🚀