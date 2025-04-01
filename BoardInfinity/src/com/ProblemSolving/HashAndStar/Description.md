### **Problem Statement: Hash and Star Transformation**

#### **Problem Description**
You are given a string consisting of only `#` (hash) and `*` (star) characters. Your task is to transform the string based on the following conditions:

1. **If the maximum count of `#` or `*` is at most 3**:
    - Construct a new string by repeating `#` **maxCount** times followed by `*` **maxCount** times.

2. **If the maximum count is greater than 3**:
    - Construct a new string by repeating `#` **minCount** times followed by `*` **minCount** times.

#### **Input Format**
- A single string **str** consisting of only `#` and `*`.

#### **Output Format**
- A transformed string based on the given conditions.

---

#### **Example Input & Output**

**Input 1:**
```
"##****"
```
**Output 1:**
```
##**
```
**Explanation:**
- The count of `#` is **2** and the count of `*` is **4**.
- Since `max(2,4) = 4`, which is greater than 3, we take `min(2,4) = 2`.
- The new string contains `#` repeated **2** times and `*` repeated **2** times.

---

**Input 2:**
```
"###**"
```
**Output 2:**
```
###**
```
**Explanation:**
- The count of `#` is **3** and the count of `*` is **2**.
- Since `max(3,2) = 3`, which is not greater than 3, we use `max(3,2) = 3`.
- The new string contains `#` repeated **3** times and `*` repeated **3** times.

---

**Input 3:**
```
"#######*"
```
**Output 3:**
```
#*
```
**Explanation:**
- The count of `#` is **7** and the count of `*` is **1**.
- Since `max(7,1) = 7`, which is greater than 3, we take `min(7,1) = 1`.
- The new string contains `#` repeated **1** time and `*` repeated **1** time.

---

### **Constraints**
- \( 1 \leq \) length of **str** \( \leq 1000 \).
- The string contains only `#` and `*`.

This problem helps in understanding **string manipulation**, **conditional logic**, and **character frequency counting**. 🚀