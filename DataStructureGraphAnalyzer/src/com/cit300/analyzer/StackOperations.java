package com.cit300.analyzer;

public class StackOperations {
    private int[] stack;
    private int top;

    public StackOperations(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) { System.out.println("Stack Overflow!"); return; }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public void pop() {
        if (isEmpty()) { System.out.println("Stack Underflow - cannot pop from empty stack."); return; }
        System.out.println("Popped: " + stack[top--]);
    }

    public void peek() {
        if (isEmpty()) { System.out.println("Stack is empty."); return; }
        System.out.println("Top element: " + stack[top]);
    }

    public boolean isEmpty() { return top == -1; }

    public void display() {
        if (isEmpty()) { System.out.println("Stack is empty."); return; }
        System.out.print("Stack (top→bottom): ");
        for (int i = top; i >= 0; i--) System.out.print(stack[i] + " ");
        System.out.println();
    }
}