package com.A1_stacks;

import java.util.Stack;

public class StackFunctions {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        System.out.println("Pushing into Stack using = > stack.push()......");
        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        stack.push("Item 4");
        System.out.println("stack.empty() => " + stack.empty());
        String item = stack.pop();

        System.out.println("stack.pop() => "+stack);
        System.out.println("poped item : "+item);
        System.out.println("Top item without poping : stack.peek() => "+stack.peek());
        System.out.println("stack => "+stack);

        System.out.println("stack.search('Item 3') => "+stack.search("Item 3"));
        System.out.println("stack.search('Item 4') => "+stack.search("Item 4")+" <= NOT FOUND");
    }
}
