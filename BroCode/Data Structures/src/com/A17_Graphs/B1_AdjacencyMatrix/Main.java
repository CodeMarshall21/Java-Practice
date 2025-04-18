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



    }
}
