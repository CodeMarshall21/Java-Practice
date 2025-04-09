## 🔷 What is a Priority Queue?

A **PriorityQueue** in Java is a type of **Queue** where elements are **ordered based on their priority**, *not insertion order*.

- In a **normal queue** → FIFO (First-In-First-Out).
- In a **priority queue** → Elements with **higher priority come out first**, regardless of when they were added.

---

## ✅ Java's `PriorityQueue` Class

It is part of the **`java.util` package**.

```java
import java.util.PriorityQueue;
```

---

## ✅ Basic Usage

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(30);
pq.add(10);
pq.add(20);

System.out.println(pq.poll()); // prints 10
```

🔍 Even though `30` was added first, `10` has the **highest priority** (because it’s the smallest), so it comes out first.

---

## ✅ How Does it Work Internally?

- Under the hood, **PriorityQueue is implemented using a binary heap**.
- Specifically, a **min-heap** by default (smallest element = highest priority).
- Stored in an **array**, but represents a tree structure logically.

> ⚙️ Time Complexity:
- `add()` → O(log n)
- `poll()` → O(log n)
- `peek()` → O(1)

---

## 🔁 Insertion Process (Heapify Up)

When you add an element:
- It's added to the end of the array.
- Then "bubbled up" to its correct position to maintain heap order.

---

## 🔁 Removal Process (Heapify Down)

When you remove the head (min or max based on config):
- The last element replaces the root.
- Then it is "heapified down" to restore the correct order.

---

## 🧠 Important Methods

| Method | Description |
|--------|-------------|
| `add(e)` / `offer(e)` | Adds element `e` to the queue |
| `poll()` | Removes and returns the highest priority element |
| `peek()` | Returns but doesn't remove the head |
| `remove(e)` | Removes a specific element |
| `contains(e)` | Checks if an element is present |

---

## 🔄 Default Ordering vs Custom

### 🔸 Default (Min-Heap):
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(50);
pq.add(10);
pq.add(30);
// Ordered by smallest first
```

### 🔸 Max-Heap (Custom Comparator):

```java
PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
maxPQ.add(10);
maxPQ.add(40);
maxPQ.add(30);
// Ordered by largest first
```

---

## 🔧 With Custom Objects

You can use PriorityQueue with your own class using `Comparator` or by implementing `Comparable`.

```java
class Task implements Comparable<Task> {
    int priority;
    String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public int compareTo(Task other) {
        return this.priority - other.priority; // min-heap
    }
}

PriorityQueue<Task> taskQueue = new PriorityQueue<>();
taskQueue.add(new Task(2, "Write"));
taskQueue.add(new Task(1, "Study"));
taskQueue.add(new Task(3, "Sleep"));

System.out.println(taskQueue.poll().name); // "Study"
```

---

## 🧪 Real-World Use Cases

| Use Case | Why PriorityQueue? |
|----------|--------------------|
| **CPU Scheduling** | Highest priority process runs first |
| **Dijkstra's Algorithm** | Greedy selection of the minimum distance node |
| **Event Management System** | Events sorted by urgency |
| **AI/Pathfinding** | A* algorithm uses it for efficient shortest path selection |
| **Cache Eviction (LFU/LRU)** | Elements removed based on usage/frequency |

---

## ❗ Notes and Gotchas

- `null` elements are **not allowed**.
- Not thread-safe → use `PriorityBlockingQueue` for concurrency.
- Iteration does **not guarantee** any specific order.
- It’s **unbounded** — grows dynamically.

---

## ✅ Summary Table

| Feature | PriorityQueue |
|--------|---------------|
| Default Behavior | Min-Heap |
| Time Complexity | O(log n) for insertion/removal |
| Backing Structure | Binary Heap (array-based) |
| Allows Duplicates | ✅ Yes |
| Null Elements | ❌ Not allowed |
| Thread-Safe | ❌ No |
| Comparable / Comparator | Needed for custom types / max-heap |
| Order Maintained | Based on priority, not insertion |

---