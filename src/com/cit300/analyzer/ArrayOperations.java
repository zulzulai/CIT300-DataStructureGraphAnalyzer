package com.cit300.analyzer;

public class ArrayOperations {
    private int[] arr;
    private int size;

    public ArrayOperations(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == arr.length) {
            System.out.println("Array is full!");
            return;
        }
        arr[size++] = value;
        System.out.println("Inserted: " + value);
    }

    public void delete(int value) {
        int idx = -1;
        for (int i = 0; i < size; i++) if (arr[i] == value) { idx = i; break; }
        if (idx == -1) { System.out.println("Value not found."); return; }
        for (int i = idx; i < size - 1; i++) arr[i] = arr[i + 1];
        size--;
        System.out.println("Deleted: " + value);
    }

    public int search(int value, PerformanceTracker tracker) {
        tracker.reset(); tracker.startTimer();
        for (int i = 0; i < size; i++) {
            tracker.incrementStep();
            if (arr[i] == value) {
                tracker.stopTimer();
                System.out.printf("Found at index %d (steps=%d, time=%.4f ms)%n",
                        i, tracker.getSteps(), tracker.getTimeMs());
                return i;
            }
        }
        tracker.stopTimer();
        System.out.println("Not found (steps=" + tracker.getSteps() + ")");
        return -1;
    }

    public void display() {
        if (size == 0) { System.out.println("Array is empty."); return; }
        System.out.print("Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}