<<<<<<< HEAD
package com.cit300.analyzer;

public class LinkedListOperations {
    class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }
    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) { head = newNode; }
        else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = newNode;
        }
        System.out.println("Inserted: " + value);
    }

    public void delete(int value) {
        if (head == null) { System.out.println("List is empty."); return; }
        if (head.data == value) { head = head.next; System.out.println("Deleted: " + value); return; }
        Node cur = head;
        while (cur.next != null && cur.next.data != value) cur = cur.next;
        if (cur.next == null) { System.out.println("Value not found."); return; }
        cur.next = cur.next.next;
        System.out.println("Deleted: " + value);
    }

    public void search(int value, PerformanceTracker tracker) {
        tracker.reset(); tracker.startTimer();
        Node cur = head; int pos = 0; boolean found = false;
        while (cur != null) {
            tracker.incrementStep();
            if (cur.data == value) { found = true; break; }
            cur = cur.next; pos++;
        }
        tracker.stopTimer();
        if (found) System.out.printf("Found at position %d (steps=%d, time=%.4f ms)%n",
                pos, tracker.getSteps(), tracker.getTimeMs());
        else System.out.println("Not found (steps=" + tracker.getSteps() + ")");
    }

    public void display() {
        if (head == null) { System.out.println("List is empty."); return; }
        System.out.print("Linked List: ");
        Node cur = head;
        while (cur != null) { System.out.print(cur.data + " -> "); cur = cur.next; }
        System.out.println("null");
    }
=======
package com.cit300.analyzer;

public class LinkedListOperations {
    class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }
    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) { head = newNode; }
        else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = newNode;
        }
        System.out.println("Inserted: " + value);
    }

    public void delete(int value) {
        if (head == null) { System.out.println("List is empty."); return; }
        if (head.data == value) { head = head.next; System.out.println("Deleted: " + value); return; }
        Node cur = head;
        while (cur.next != null && cur.next.data != value) cur = cur.next;
        if (cur.next == null) { System.out.println("Value not found."); return; }
        cur.next = cur.next.next;
        System.out.println("Deleted: " + value);
    }

    public void search(int value, PerformanceTracker tracker) {
        tracker.reset(); tracker.startTimer();
        Node cur = head; int pos = 0; boolean found = false;
        while (cur != null) {
            tracker.incrementStep();
            if (cur.data == value) { found = true; break; }
            cur = cur.next; pos++;
        }
        tracker.stopTimer();
        if (found) System.out.printf("Found at position %d (steps=%d, time=%.4f ms)%n",
                pos, tracker.getSteps(), tracker.getTimeMs());
        else System.out.println("Not found (steps=" + tracker.getSteps() + ")");
    }

    public void display() {
        if (head == null) { System.out.println("List is empty."); return; }
        System.out.print("Linked List: ");
        Node cur = head;
        while (cur != null) { System.out.print(cur.data + " -> "); cur = cur.next; }
        System.out.println("null");
    }
>>>>>>> d9d3e27404c257246bb6aba2d1b928d56278097c
}