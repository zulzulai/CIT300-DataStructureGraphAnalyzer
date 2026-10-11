<<<<<<< HEAD
package com.cit300.analyzer;

public class QueueOperations {
    private int[] queue;
    private int front, rear, size;

    public QueueOperations(int capacity) {
        queue = new int[capacity];
        front = 0; rear = -1; size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) { System.out.println("Queue is full!"); return; }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    public void dequeue() {
        if (size == 0) { System.out.println("Queue Underflow - cannot dequeue from empty queue."); return; }
        System.out.println("Dequeued: " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }

    public void peek() {
        if (size == 0) { System.out.println("Queue is empty."); return; }
        System.out.println("Front element: " + queue[front]);
    }

    public void display() {
        if (size == 0) { System.out.println("Queue is empty."); return; }
        System.out.print("Queue (front→rear): ");
        for (int i = 0; i < size; i++) System.out.print(queue[(front + i) % queue.length] + " ");
        System.out.println();
    }
=======
package com.cit300.analyzer;

public class QueueOperations {
    private int[] queue;
    private int front, rear, size;

    public QueueOperations(int capacity) {
        queue = new int[capacity];
        front = 0; rear = -1; size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) { System.out.println("Queue is full!"); return; }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    public void dequeue() {
        if (size == 0) { System.out.println("Queue Underflow - cannot dequeue from empty queue."); return; }
        System.out.println("Dequeued: " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }

    public void peek() {
        if (size == 0) { System.out.println("Queue is empty."); return; }
        System.out.println("Front element: " + queue[front]);
    }

    public void display() {
        if (size == 0) { System.out.println("Queue is empty."); return; }
        System.out.print("Queue (front→rear): ");
        for (int i = 0; i < size; i++) System.out.print(queue[(front + i) % queue.length] + " ");
        System.out.println();
    }
>>>>>>> d9d3e27404c257246bb6aba2d1b928d56278097c
}