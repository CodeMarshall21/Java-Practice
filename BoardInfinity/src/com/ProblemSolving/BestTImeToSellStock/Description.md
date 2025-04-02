### **Problem Statement: Best Time to Buy and Sell Stock**

You are given an array `stockPrice` where `stockPrice[i]` represents the stock price on the `i-th` day. Your task is to determine the **maximum profit** that can be achieved by buying and selling the stock **once**.

#### **Constraints:**
- You must buy before you sell.
- You can only complete **one** transaction (i.e., buy one stock and sell it later).
- If no profit can be made, return `0`.

#### **Example:**
**Input:**
```  
stockPrice = [7,1,5,3,6,4]  
```  
**Output:**
```  
Highest Profit: 5  
```  
**Explanation:**
- Buy at **1** (Day 2) and sell at **6** (Day 5) → Profit = `6 - 1 = 5`
- The maximum profit possible is `5`.