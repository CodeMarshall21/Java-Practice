# Graphs in Java - Complete Reference

---

## 📌 What is a Graph?

A **graph** is a non-linear data structure consisting of **nodes** (also called **vertices**) and **edges** that connect pairs of nodes. Graphs are used to model relationships and networks such as social networks, web page links, city maps, etc.

---

## 🔁 Types of Graphs

1. **Based on Direction:**
    - **Undirected Graph**: Edges have no direction. If A is connected to B, then B is connected to A.
    - **Directed Graph (Digraph)**: Edges have direction. If A → B, then only A is connected to B.

2. **Based on Weight:**
    - **Unweighted Graph**: All edges have the same weight.
    - **Weighted Graph**: Each edge carries a weight (e.g., distance, cost).

3. **Based on Cycles:**
    - **Cyclic Graph**: Contains at least one cycle.
    - **Acyclic Graph**: No cycles present.

4. **Based on Connectivity:**
    - **Connected Graph**: There is a path between every pair of vertices.
    - **Disconnected Graph**: Not all vertices are connected.

5. **Special Graphs:**
    - **Tree**: A connected acyclic graph.
    - **DAG (Directed Acyclic Graph)**: A directed graph with no cycles.

---

## 💡 Key Terminologies

- **Vertex (Node)**: Fundamental unit in the graph.
- **Edge**: Connects two vertices.
- **Adjacency**: Two nodes are adjacent if they are connected by an edge.
- **Degree**: Number of edges connected to a vertex.
- **Path**: Sequence of vertices connected by edges.
- **Cycle**: A path that starts and ends at the same vertex.

---

## 📊 Graph Representation in Java

Graphs can be represented using:

### 1. **Adjacency Matrix**

- A 2D array where the row and column indices represent nodes.
- `matrix[i][j] = 1` indicates an edge between node `i` and `j`.
- For undirected graphs, `matrix[i][j] = matrix[j][i]`.
- For weighted graphs, `matrix[i][j] = weight`.

#### ✅ Code (Adjacency Matrix Representation)

```java
import java.util.ArrayList;

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }
}

class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(char node) {
        nodes.add(new Node(node));
    }

    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode('A');
        graph.addNode('B');
        graph.addNode('C');
        graph.addNode('D');
        graph.addNode('E');

        graph.print();
    }
}
```

---

## 🧠 Intuition Behind Adjacency Matrix

- Think of it as a table. Rows and columns represent nodes.
- If there's a connection between node A and B, mark `1` in the cell (A,B).
- It's great for **dense** graphs (where many connections exist).

### ✅ Pros
- Easy to implement.
- Constant time edge checks (`O(1)` for `matrix[i][j]`).

### ❌ Cons
- Consumes more space for sparse graphs.
- Inefficient when the number of edges is far less than the number of nodes squared (`O(n^2)` space).

---

## ⌛ Time and Space Complexity (Adjacency Matrix)

| Operation          | Time Complexity | Space Complexity |
|-------------------|------------------|------------------|
| Add Edge          | O(1)             | O(n²)            |
| Remove Edge       | O(1)             |                  |
| Check Edge Exists | O(1)             |                  |
| Traverse Neighbors| O(n)             |                  |

---

## 📘 Summary

- Graphs are a core part of computer science for modeling relationships.
- Adjacency Matrix is one of the fundamental representations, great for dense graphs.
- Java's OOP makes graphs easier to manage using classes like `Node` and `Graph`.
- Practice both Adjacency Matrix and Adjacency List to choose based on the use case.

---

