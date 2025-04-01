### **Problem Statement: Anagram Pairs in Paragraph**

#### **Problem Description**
You are given a paragraph consisting of multiple words. Your task is to find how many pairs of words in the paragraph are **anagrams** of each other.

#### **Input Format**
- A paragraph as a string, where words are separated by spaces.

#### **Output Format**
- The number of pairs of anagrams found in the paragraph.

#### **Example Input & Output**

**Input 1:**
```
Paragraph:- 
Listen silent hello world
```

**Output 1:**
```
Number of Pairs: 1
```
**Explanation:**
- "Listen" and "silent" are anagrams, so the output is 1.

---

**Input 2:**
```
Paragraph:- 
rat tar art
```

**Output 2:**
```
Number of Pairs: 3
```
**Explanation:**
- "rat" and "tar" are anagrams.
- "rat" and "art" are anagrams.
- "tar" and "art" are anagrams.
  Thus, the total number of pairs is 3.

---

**Input 3:**
```
Paragraph:- 
hello world
```

**Output 3:**
```
Number of Pairs: 0
```
**Explanation:**
- There are no anagram pairs in this paragraph, so the output is 0.

---

#### **Constraints**
- The paragraph will contain a maximum of \(10^4\) characters.
- Words are separated by spaces.
- All words consist of lowercase English letters only.

This problem helps in understanding **string manipulation**, **sorting**, and **comparing arrays** to identify anagram pairs.