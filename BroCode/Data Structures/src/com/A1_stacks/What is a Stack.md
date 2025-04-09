## 📚 What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO** principle:
> **Last-In, First-Out** — the last element added is the first one to be removed.

### 📦 Real-life examples:
- **Undo** feature in an editor
- **Back** button in browsers
- Call stack in recursion

---

## ✅ Java’s Stack Class

Java provides a built-in **`Stack` class** inside the `java.util` package.

```java
import java.util.Stack;
```

---

## ✅ Basic Operations

| Method | Description |
|--------|-------------|
| `push(element)` | Adds an element to the top of the stack |
| `pop()` | Removes and returns the top element |
| `peek()` | Returns the top element without removing |
| `isEmpty()` | Checks if the stack is empty |
| `search(element)` | Returns 1-based position from top (or -1 if not found) |

---

### 📌 Example:

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek()); // 30 (top)
System.out.println(stack.pop());  // 30 (removed)
System.out.println(stack.peek()); // 20
System.out.println(stack.isEmpty()); // false
```

---

## 🔍 Internal Working of Stack

- Internally, `Stack` is a subclass of **`Vector`** (a dynamic array).
- So, all stack operations happen on top of a resizable array.
- Unlike the logical "vertical" stack in diagrams, it's just an **array where the end is treated as the top of the stack**.

> 🎯 Operations like `push()` and `pop()` just add/remove from the end of the internal array.

---

## 📉 Time Complexity

| Operation | Time |
|-----------|------|
| push()    | O(1) |
| pop()     | O(1) |
| peek()    | O(1) |
| search()  | O(n) |

---

## ⚠️ Limitations of Java's Stack Class

- `Stack` is a **legacy class** from early Java versions.
- It's **synchronized** (thread-safe) but that makes it slower in single-threaded use.
- **Better alternative in modern Java**: `Deque` (double-ended queue) from `ArrayDeque` or `LinkedList`.

---

## 🚀 Recommended Modern Approach: `Deque`

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(1);      // same as addFirst()
stack.push(2);
stack.push(3);

System.out.println(stack.pop());  // 3
System.out.println(stack.peek()); // 2
```

### ✔️ Why use `ArrayDeque` instead of `Stack`?
- Faster (not synchronized)
- No legacy overhead
- More flexible
- No memory overhead of `Vector`

---

## 🧠 Real-World Use Cases

| Use Case | Explanation |
|----------|-------------|
| **Balanced Parentheses Checker** | Push `(` and pop when you find `)` |
| **Undo Functionality** | Push operations, pop to revert |
| **Call Stack** | Tracks active methods in a program |
| **Backtracking** | For solving puzzles, DFS, etc. |
| **Expression Evaluation** | Infix → Postfix → Evaluation |
| **Browser Back Navigation** | Pages pushed, and popped when going back |

---

## 💡 Common Interview Questions Using Stack

1. **Balanced brackets/parentheses**
2. **Evaluate Reverse Polish Notation**
3. **Min Stack** (design stack with getMin in O(1))
4. **Next Greater Element**
5. **Implement Queue using Stacks**
6. **Stock Span Problem**
7. **Largest Rectangle in Histogram**

---

## 🧪 Stack with Custom Objects

```java
class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
}

Stack<Book> books = new Stack<>();
books.push(new Book("Java 101"));
books.push(new Book("DSA Mastery"));

System.out.println(books.pop().title); // DSA Mastery
```

---

## 🔁 How It Looks Visually

Let's say you do:

```java
stack.push(10);
stack.push(20);
stack.push(30);
```

Internally:

```
| 30 |  <-- Top
| 20 |
| 10 |
```

When `pop()` is called, `30` is removed and returned.

---

## 🧾 Summary Table

| Feature | Value |
|--------|-------|
| Order | LIFO (Last-In, First-Out) |
| Backed By | Vector (resizable array) |
| Synchronized | Yes |
| Better Alt | ArrayDeque |
| Use `push()` | Yes |
| Use `add()` | No, ambiguous in Queue context |
| Preferred for Modern Java | ❌ (Stack) ✅ (Deque) |
| Null Elements | Allowed but discouraged |

---
