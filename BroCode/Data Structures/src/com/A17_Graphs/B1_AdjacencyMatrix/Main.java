package com.A17_Graphs.B1_AdjacencyMatrix;

public class Main {
    public static void main(String[] args) {
        // Adjacency Matrix = An array to store 1's/0's to represent edges
        //				       # of rows =    # of unique nodes
        //				       # of columns = # of unique nodes

        //					  runtime complexity to check an Edge: O(1)
        //					  space complexity: O(v^2)

        Graph graph = new Graph(5);

        graph.addNode('A');
        graph.addNode('B');
        graph.addNode('C');
        graph.addNode('D');
        graph.addNode('E');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.printMatrix();

        System.out.println(graph.checkEdge(0, 1));



    }
}
