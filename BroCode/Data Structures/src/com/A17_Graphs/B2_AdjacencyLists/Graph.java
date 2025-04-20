package com.A17_Graphs.B2_AdjacencyLists;

import java.util.*;

public class Graph {
    ArrayList<LinkedList<Node>> adjList;

    Graph(){
        adjList = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjList.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = adjList.get(src);
        Node dstNode = adjList.get(dst).get(0);
        currentList.add(dstNode);

//        Or could be replaced with :-
//        Node dstNode = adjList.get(dst).get(0);
//        adjList.get(src).add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = adjList.get(src);
        Node dstNode = adjList.get(dst).get(0);

        for(Node node: currentList){
            if (node == dstNode){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> lists: adjList){
            for(Node node: lists){
                System.out.print(node.data+" -> ");
            }
            System.out.println();
        }

    }

}
