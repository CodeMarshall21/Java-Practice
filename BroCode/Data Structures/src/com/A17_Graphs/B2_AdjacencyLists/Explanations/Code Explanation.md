### 🔹 Main Class

```java
public class Main {
```

- This is the starting point of the program.
- A class named `Main`, which holds the `main` method—the entry point of any Java application.

---

```java
	public static void main(String[] args) {
```

- `public`: This method can be accessed from anywhere.
- `static`: You don’t need to create an object of `Main` to run this method.
- `void`: This method doesn't return anything.
- `main(String[] args)`: The method that gets executed when the program runs. `args` holds any command-line arguments.

---

```java
		Graph graph = new Graph();
```

- We're creating an object of the `Graph` class.
- This object will allow us to use all the graph-related methods (`addNode`, `addEdge`, etc.).

---

```java
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
```

- We're adding 5 **nodes** to the graph.
- Each node is represented by a **character**: A, B, C, D, E.
- We're passing these characters to the `Node` constructor (`new Node('A')`), and then adding them using `addNode`.

---

```java
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
```

- We're adding **directed edges** from one node to another.
- For example: `addEdge(0, 1)` means from Node A to Node B.
- These indices refer to the **position** of the node in the list:
    - 0 → A
    - 1 → B
    - 2 → C
    - 3 → D
    - 4 → E

---

```java
		graph.print();
```

- We're calling the `print()` method to display the graph’s connections.

---

```java
		//System.out.println(graph.checkEdge(0, 1));
```

- (Commented out) This would check whether an edge from node 0 to node 1 exists and print the result as `true` or `false`.

---

---

## 🔹 Graph Class

```java
import java.util.*;
```

- We’re importing Java’s `ArrayList` and `LinkedList` classes.
- `ArrayList` is a resizable array.
- `LinkedList` is a list of connected nodes, used here to represent adjacency lists.

---

```java
public class Graph {
```

- We’re defining our `Graph` class where all graph-related methods will be written.

---

```java
	ArrayList<LinkedList<Node>> alist;
```

- `alist` is an ArrayList of LinkedLists.
- Each element in `alist` is a LinkedList.
- Each LinkedList holds a node and its adjacent (connected) nodes.

---

```java
	Graph(){
		alist = new ArrayList<>();
	}
```

- This is the **constructor** of the `Graph` class.
- When you create a new `Graph` object, it initializes `alist` as an empty list.

---

```java
	public void addNode(Node node) {
		LinkedList<Node> currentList = new LinkedList<>();
		currentList.add(node);
		alist.add(currentList);
	}
```

- This method adds a node to the graph.
- A new `LinkedList` is created for each node.
- The node itself is added as the **first item** in its list (so we know which node it is).
- Then, this list is added to the master `alist`.

🔁 Example:
```
alist = [
  [A],
  [B],
  [C],
  [D],
  [E]
]
```

---

```java
	public void addEdge(int src, int dst) {
		LinkedList<Node> currentList = alist.get(src);
		Node dstNode = alist.get(dst).get(0);
		currentList.add(dstNode);
	}
```

- Adds an edge from the node at index `src` to the node at index `dst`.
- `alist.get(src)` retrieves the LinkedList of the source node.
- `alist.get(dst).get(0)` fetches the destination node object.
- That node is added to the source's LinkedList.

🔁 After `addEdge(0,1)`, `alist[0]` becomes:
```
[A, B]
```
Meaning there's an edge from A → B.

---

```java
	public boolean checkEdge(int src, int dst) {
		LinkedList<Node> currentList = alist.get(src);
		Node dstNode = alist.get(dst).get(0);
		
		for(Node node : currentList) {
			if(node == dstNode) {
				return true;
			}
		}
		return false;
	}
```

- This method checks whether an edge exists from `src` to `dst`.
- We loop through the LinkedList of the source node.
- If we find the destination node in the list, return `true`, else `false`.

---

```java
	public void print() {
		for(LinkedList<Node> currentList : alist) {
			for(Node node : currentList) {
				System.out.print(node.data + " -> ");
			}
			System.out.println();
		}
	}
```

- This prints out each node and its outgoing edges.
- For example:
```
A -> B ->
B -> C -> E ->
...
```
- This tells you who is connected to whom.

---

---

## 🔹 Node Class

```java
public class Node {
```

- A simple class that represents a node (vertex) in a graph.

---

```java
	char data;
```

- A character to represent the node (like 'A', 'B', etc.).

---

```java
	Node(char data){
		this.data = data;
	}
```

- Constructor: initializes the `data` field when the object is created.

---

## 🔚 Summary

- **Nodes** are stored in an `ArrayList` of `LinkedLists`.
- Each LinkedList holds the main node and all the nodes it points to (its edges).
- This is an **Adjacency List representation** of a **directed graph**.
- You can:
    - Add nodes ✅
    - Add edges ✅
    - Check if an edge exists ✅
    - Print the whole graph ✅

---