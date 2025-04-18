package com.A17_Graphs.B1_AdjacencyMatrix;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node>nodes;
    int[][] matrix;


    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(char node){
        nodes.add(new Node(node));
    }

    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        return matrix[src][dst] == 1;
    }

    public void printMatrix(){
        System.out.println(" ");
        for(Node node: nodes){
            System.out.println(node.data+" ");
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(nodes.get(i).data+" ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
