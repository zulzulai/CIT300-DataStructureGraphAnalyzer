<<<<<<< HEAD
package com.cit300.analyzer;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    static ArrayOperations array = new ArrayOperations(100);
    static StackOperations stack = new StackOperations(100);
    static QueueOperations queue = new QueueOperations(100);
    static LinkedListOperations list = new LinkedListOperations();
    static SearchingOperations searching = new SearchingOperations();
    static GraphOperations graph = new GraphOperations();
    static PerformanceTracker tracker = new PerformanceTracker();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== DATA STRUCTURE & GRAPH ANALYZER =====");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            int choice = InputValidator.getInt(sc, "Enter your choice: ");
            switch (choice) {
                case 1 -> arrayMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> listMenu();
                case 5 -> searchMenu();
                case 6 -> graphMenu();
                case 7 -> performanceDemo();
                case 8 -> displayAll();
                case 9 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void arrayMenu() {
        while (true) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert 2. Delete 3. Search 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) array.insert(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) array.delete(InputValidator.getInt(sc, "Value: "));
            else if (c == 3) array.search(InputValidator.getInt(sc, "Value: "), tracker);
            else if (c == 4) array.display();
            else return;
        }
    }

    static void stackMenu() {
        while (true) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push 2. Pop 3. Peek 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) stack.push(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) stack.pop();
            else if (c == 3) stack.peek();
            else if (c == 4) stack.display();
            else return;
        }
    }

    static void queueMenu() {
        while (true) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue 2. Dequeue 3. Peek 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) queue.enqueue(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) queue.dequeue();
            else if (c == 3) queue.peek();
            else if (c == 4) queue.display();
            else return;
        }
    }

    static void listMenu() {
        while (true) {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert 2. Delete 3. Search 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) list.insert(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) list.delete(InputValidator.getInt(sc, "Value: "));
            else if (c == 3) list.search(InputValidator.getInt(sc, "Value: "), tracker);
            else if (c == 4) list.display();
            else return;
        }
    }

    static void searchMenu() {
        System.out.println("\n--- SEARCHING OPERATIONS ---");
        int n = InputValidator.getInt(sc, "How many numbers? ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = InputValidator.getInt(sc, "Value " + (i+1) + ": ");
        searching.setData(arr);
        int target = InputValidator.getInt(sc, "Target value: ");
        searching.linearSearch(target, tracker);
        searching.binarySearch(target, tracker);
    }

    static void graphMenu() {
        while (true) {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex 2. Add Edge 3. Display 4. BFS 5. DFS 6. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) { System.out.print("Vertex name: "); graph.addVertex(sc.nextLine().trim()); }
            else if (c == 2) {
                System.out.print("From: "); String u = sc.nextLine().trim();
                System.out.print("To: "); String v = sc.nextLine().trim();
                graph.addEdge(u, v);
            }
            else if (c == 3) graph.display();
            else if (c == 4) { System.out.print("Start: "); graph.bfs(sc.nextLine().trim(), tracker); }
            else if (c == 5) { System.out.print("Start: "); graph.dfs(sc.nextLine().trim(), tracker); }
            else return;
        }
    }

    static void performanceDemo() {
        System.out.println("\n===== PERFORMANCE COMPARISON =====");
        System.out.printf("%-20s %-15s %-10s %-15s%n", "Operation", "Algorithm", "Steps", "Time(ms)");
        // Run a demo
        int[] demo = new int[1000];
        for (int i = 0; i < 1000; i++) demo[i] = i + 1;
        searching.setData(demo);
        System.out.print("Linear search demo: ");
        searching.linearSearch(1000, tracker);
        System.out.print("Binary search demo: ");
        searching.binarySearch(1000, tracker);
    }

    static void displayAll() {
        System.out.println("\n===== ALL CURRENT RESULTS =====");
        array.display();
        stack.display();
        queue.display();
        list.display();
        graph.display();
    }
=======
package com.cit300.analyzer;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    static ArrayOperations array = new ArrayOperations(100);
    static StackOperations stack = new StackOperations(100);
    static QueueOperations queue = new QueueOperations(100);
    static LinkedListOperations list = new LinkedListOperations();
    static SearchingOperations searching = new SearchingOperations();
    static GraphOperations graph = new GraphOperations();
    static PerformanceTracker tracker = new PerformanceTracker();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== DATA STRUCTURE & GRAPH ANALYZER =====");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            int choice = InputValidator.getInt(sc, "Enter your choice: ");
            switch (choice) {
                case 1 -> arrayMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> listMenu();
                case 5 -> searchMenu();
                case 6 -> graphMenu();
                case 7 -> performanceDemo();
                case 8 -> displayAll();
                case 9 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void arrayMenu() {
        while (true) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert 2. Delete 3. Search 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) array.insert(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) array.delete(InputValidator.getInt(sc, "Value: "));
            else if (c == 3) array.search(InputValidator.getInt(sc, "Value: "), tracker);
            else if (c == 4) array.display();
            else return;
        }
    }

    static void stackMenu() {
        while (true) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push 2. Pop 3. Peek 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) stack.push(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) stack.pop();
            else if (c == 3) stack.peek();
            else if (c == 4) stack.display();
            else return;
        }
    }

    static void queueMenu() {
        while (true) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue 2. Dequeue 3. Peek 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) queue.enqueue(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) queue.dequeue();
            else if (c == 3) queue.peek();
            else if (c == 4) queue.display();
            else return;
        }
    }

    static void listMenu() {
        while (true) {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert 2. Delete 3. Search 4. Display 5. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) list.insert(InputValidator.getInt(sc, "Value: "));
            else if (c == 2) list.delete(InputValidator.getInt(sc, "Value: "));
            else if (c == 3) list.search(InputValidator.getInt(sc, "Value: "), tracker);
            else if (c == 4) list.display();
            else return;
        }
    }

    static void searchMenu() {
        System.out.println("\n--- SEARCHING OPERATIONS ---");
        int n = InputValidator.getInt(sc, "How many numbers? ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = InputValidator.getInt(sc, "Value " + (i+1) + ": ");
        searching.setData(arr);
        int target = InputValidator.getInt(sc, "Target value: ");
        searching.linearSearch(target, tracker);
        searching.binarySearch(target, tracker);
    }

    static void graphMenu() {
        while (true) {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex 2. Add Edge 3. Display 4. BFS 5. DFS 6. Back");
            int c = InputValidator.getInt(sc, "Choice: ");
            if (c == 1) { System.out.print("Vertex name: "); graph.addVertex(sc.nextLine().trim()); }
            else if (c == 2) {
                System.out.print("From: "); String u = sc.nextLine().trim();
                System.out.print("To: "); String v = sc.nextLine().trim();
                graph.addEdge(u, v);
            }
            else if (c == 3) graph.display();
            else if (c == 4) { System.out.print("Start: "); graph.bfs(sc.nextLine().trim(), tracker); }
            else if (c == 5) { System.out.print("Start: "); graph.dfs(sc.nextLine().trim(), tracker); }
            else return;
        }
    }

    static void performanceDemo() {
        System.out.println("\n===== PERFORMANCE COMPARISON =====");
        System.out.printf("%-20s %-15s %-10s %-15s%n", "Operation", "Algorithm", "Steps", "Time(ms)");
        // Run a demo
        int[] demo = new int[1000];
        for (int i = 0; i < 1000; i++) demo[i] = i + 1;
        searching.setData(demo);
        System.out.print("Linear search demo: ");
        searching.linearSearch(1000, tracker);
        System.out.print("Binary search demo: ");
        searching.binarySearch(1000, tracker);
    }

    static void displayAll() {
        System.out.println("\n===== ALL CURRENT RESULTS =====");
        array.display();
        stack.display();
        queue.display();
        list.display();
        graph.display();
    }
>>>>>>> d9d3e27404c257246bb6aba2d1b928d56278097c
}