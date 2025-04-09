## 📚 What is a Queue?

A **Queue** is a linear data structure that follows the **FIFO** principle:

> **First-In, First-Out** — the first element added is the first to be removed.

### 📦 Real-life examples:
- People standing in a line (first person in gets served first).
- Print jobs queued to a printer.
- CPU scheduling (First-Come-First-Serve).
- Message queues, request processing systems.

---

## ✅ Java’s Queue Interface

Java provides the **`Queue` interface** in the `java.util` package.  
It is **not a class**, so you can’t create a `new Queue()` — you use classes like:

| Implementation | Backed By |
|----------------|-----------|
| `LinkedList`   | Doubly linked list |
| `ArrayDeque`   | Resizable array (faster for single-threaded use) |
| `PriorityQueue`| Binary heap (sorted order) |
| `ConcurrentLinkedQueue` | Thread-safe (for concurrency) |

```java
Queue<Integer> queue = new LinkedList<>();
```

---

## ✅ Basic Operations

| Method        | Description |
|---------------|-------------|
| `add(e)`      | Inserts element. Throws exception if full (bounded queues). |
| `offer(e)`    | Inserts element. Returns false if full. |
| `remove()`    | Removes and returns head. Throws exception if empty. |
| `poll()`      | Removes and returns head. Returns `null` if empty. |
| `element()`   | Returns head without removing. Throws exception if empty. |
| `peek()`      | Returns head without removing. Returns `null` if empty. |

> `offer()` and `poll()` are safer alternatives to `add()` and `remove()`.

---

### 📌 Example:

```java
Queue<String> queue = new LinkedList<>();

queue.offer("A");
queue.offer("B");
queue.offer("C");

System.out.println(queue);        // [A, B, C]
System.out.println(queue.poll()); // A
System.out.println(queue.peek()); // B
```

---

## 🔍 Internal Working

Let’s look at the 2 most common implementations:

### 1️⃣ `LinkedList`

- Each element is a **node** with pointers to the next and previous nodes.
- `offer()` adds to the tail.
- `poll()` removes from the head.
- Efficient O(1) operations.

```java
Queue<Integer> q = new LinkedList<>();
```

> Internally uses doubly linked list with `first`, `last`, and `size`.

---

### 2️⃣ `ArrayDeque`

- Backed by a **resizable array**.
- Faster than LinkedList because no pointer chasing.
- Can be used as **Queue (FIFO)** or **Stack (LIFO)**.

```java
Queue<Integer> q = new ArrayDeque<>();
```

> Internally has a circular array to avoid shifting elements.

---

### ⚠️ Note:
- `Queue` is an **interface**, not a data structure itself.
- You always use a class that implements it.

---

## 📉 Time Complexity

| Operation | LinkedList | ArrayDeque |
|-----------|------------|------------|
| `offer()` | O(1)       | Amortized O(1) |
| `poll()`  | O(1)       | Amortized O(1) |
| `peek()`  | O(1)       | O(1)        |

---

## 🔁 How It Works (Visually)

```java
queue.offer(10);
queue.offer(20);
queue.offer(30);
```

Internally:

```
Front --> 10 -> 20 -> 30 --> Rear
```

- `poll()` removes from **front** (10 goes out)
- `offer(40)` adds at **rear** → 20 -> 30 -> 40

---

## 🧠 Real-World Use Cases

| Use Case | Explanation |
|----------|-------------|
| **Request Handling** | Queue of incoming web requests |
| **Thread Scheduling** | FIFO-based execution |
| **Buffering** | Queue for streams (audio/video) |
| **BFS Traversal** | Used in Graphs |
| **Producer-Consumer Problem** | Queues handle flow between threads |

---

## 📥 Bounded Queues (`BlockingQueue`)

- Part of `java.util.concurrent` package.
- Used in multithreading.
- `ArrayBlockingQueue`, `LinkedBlockingQueue`

```java
BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

queue.put(10);   // waits if full
queue.take();    // waits if empty
```

---

## 🔄 Circular Queue

- Fixed-size queue with wrap-around behavior.
- Implemented in `ArrayDeque` with efficient head/tail pointers.

---

## 🎯 PriorityQueue (Different Behavior)

- Not FIFO.
- Orders elements by **priority**, not insertion order.
- Uses a **Min Heap** internally.

```java
Queue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(1);
pq.offer(3);

System.out.println(pq.poll()); // 1 (smallest first)
```

---

## 🔬 Internals Recap

| Queue Type         | Backing Structure | Ordering       |
|--------------------|-------------------|----------------|
| `LinkedList`       | Doubly linked list| Insertion order|
| `ArrayDeque`       | Circular array    | Insertion order|
| `PriorityQueue`    | Binary heap       | Natural/custom priority|
| `ConcurrentLinkedQueue` | Linked list | Insertion (Thread-safe) |

---

## 🚫 Pitfalls

- `Queue` has no direct index access (`get(i)` is not allowed).
- `Queue` is not synchronized by default.
- `PriorityQueue` may not give you sorted order when printed — only when polled.

---

## 🧾 Summary Table

| Feature | Value |
|--------|-------|
| Principle | FIFO |
| Interface | `Queue<E>` |
| Common Classes | `LinkedList`, `ArrayDeque`, `PriorityQueue` |
| Null Elements | Not allowed in `ArrayDeque` or `PriorityQueue` |
| Random Access | ❌ |
| Thread-safe | ❌ (unless using `Concurrent` variants) |
| Use Case | Request handling, BFS, stream buffers, schedulers |

---