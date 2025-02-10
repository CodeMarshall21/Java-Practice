package com.stacks;

import java.util.Stack;

public class StackCreation {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println("stack.empty() => " + stack.empty());
        System.out.println("Pushing into Stack using = > stack.push()......");
        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        stack.push("Item 4");
        System.out.println("stack.empty() => " + stack.empty());
        System.out.println("stack => "+stack);


    }
}
