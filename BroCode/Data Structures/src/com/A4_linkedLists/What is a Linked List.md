
## ✅ What is a LinkedList?

`LinkedList` is a **linear data structure** where each element (called a node) holds:
- **Data**
- A reference (or pointer) to the **next node** in the sequence
- (Optionally) a reference to the **previous node** in case of **doubly linked lists**

In Java, `LinkedList` is a class provided in the **`java.util` package** and implements:
- `List` (for list behaviors)
- `Deque` (double-ended queue behaviors)
- `Queue`

---

## 🔍 Key Characteristics:
- Maintains **insertion order**
- Can contain **duplicate** elements
- Allows **null** elements
- Not synchronized (must manually synchronize for multi-threading)
- Slower at random access (`get(index)`) compared to `ArrayList`
- Fast at insertions/deletions from **beginning and middle**

---

## 🔧 Internal Working:

Java's `LinkedList` is actually a **doubly linked list**. Internally, it has a private static class:

```java
private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
```

When you do `linkedList.add("A")`, it creates a new `Node` and links it appropriately.

---

## 🧠 How it behaves internally:
- Each element is wrapped in a `Node` object
- When an element is added, a new node is created and connected via `.next` and `.prev` pointers
- Insertion at **beginning or end** is `O(1)`
- Accessing an element by index is `O(n)` (it may traverse from the front or back depending on index)

---

## 📦 Common Operations

### 1. Add Elements
```java
LinkedList<String> list = new LinkedList<>();
list.add("Apple");           // Adds at the end
list.addFirst("Banana");     // Adds at the beginning
list.addLast("Cherry");      // Adds at the end
```

### 2. Remove Elements
```java
list.remove();               // Removes first element
list.removeLast();           // Removes last element
list.remove("Apple");        // Removes specific element
```

### 3. Access Elements
```java
list.get(1);                 // Random access (but not fast)
list.peek();                 // View first element
list.peekLast();             // View last element
```

### 4. Iterate Elements
```java
for(String fruit : list) {
    System.out.println(fruit);
}
```

---

## 📊 Time Complexity

| Operation        | Time Complexity |
|------------------|-----------------|
| Add First/Last   | O(1)            |
| Remove First/Last| O(1)            |
| Add at Index     | O(n)            |
| Remove at Index  | O(n)            |
| Get by Index     | O(n)            |
| Contains         | O(n)            |

---

## 🆚 ArrayList vs LinkedList

| Feature            | ArrayList        | LinkedList       |
|--------------------|------------------|------------------|
| Backed by          | Dynamic Array     | Doubly Linked List |
| Random Access      | Fast (`O(1)`)     | Slow (`O(n)`)     |
| Insertion/Deletion | Slow (shifting)   | Fast (pointer update) |
| Memory             | Compact           | Extra memory for pointers |

---

## 🧪 Use Cases
- **Fast insertion/deletion** at both ends
- **Queue and Deque implementations**
- Scenarios where frequent modifications (add/remove) are needed

---

## 🛑 Things to Watch For
- Avoid `get(i)` repeatedly in loops — it's `O(n)`
- If you need **index-based** access often, prefer `ArrayList`
- `LinkedList` uses **more memory** due to node object overhead

---