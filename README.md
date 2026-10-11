# Data Structure & Graph Analyzer (CIT300)

## Project Description

A Java-based console application that demonstrates the practical application of data structures (Array, Stack, Queue, Linked List), searching algorithms (Linear and Binary Search), and graph traversal algorithms (BFS and DFS) with performance comparison.

## Team Members

| Name | Student ID | Assigned Responsibility | Individual Contribution |
|------|-----------|------------------------|------------------------|
| M.N Rifa | 23da2-0502 | Array & Searching  | Array ops, Linear/Binary search  |
| A.F Shihnas |23da2-0513  | Stack & Queue  | Push, Pop, Enqueue, Dequeue |
| J.H Zulaiha | 23da2-0778 | Linked List | Insert, Delete, Search, Display |
| M.N.F Rizma | 23da2-0482 | Graph Component  | Graph class, BFS, DFS, integration  |
| A.F Shihnas | 23da2-0513 | Integration & Performance | Main menu, performance comparison |

## Technologies Used

- Java 8+
- Eclipse IDE
- Git & GitHub

## Main System Features

- **Array Operations:** Insert, Delete, Search, Display
- **Stack Operations:** Push, Pop, Peek, Display (with underflow handling)
- **Queue Operations:** Enqueue, Dequeue, Peek, Display (with underflow handling)
- **Linked List Operations:** Insert, Delete, Search, Display
- **Searching:** Linear Search and Binary Search with step/time comparison
- **Graph:** Add Vertex, Add Edge, Display, BFS, DFS
- **Performance Comparison** module
- Input validation and error handling

## Instructions to Run

### Prerequisites
- Java JDK 8 or higher installed
- Eclipse IDE (or any Java IDE)

### Steps
1. Clone the repository:
   git clone https://github.com/zulzulai/CIT300-DataStructureGraphAnalyzer.git

2. Open Eclipse

3. File → Import → General → Existing Projects into Workspace

4. Select the cloned folder → Finish

5. Open `Main.java` in `src/com/cit300/analyzer/`

6. Right-click → Run As → Java Application

7. Follow the on-screen menu

## Project Structure

DataStructureGraphAnalyzer/
├── src/com/cit300/analyzer/
│   ├── Main.java
│   ├── ArrayOperations.java
│   ├── StackOperations.java
│   ├── QueueOperations.java
│   ├── LinkedListOperations.java
│   ├── SearchingOperations.java
│   ├── GraphOperations.java
│   ├── PerformanceTracker.java
│   └── InputValidator.java
└── README.md

## Performance / Complexity Summary

| Operation | Algorithm | Complexity |
|-----------|-----------|------------|
| Search | Linear Search | O(n) |
| Search | Binary Search | O(log n) |
| Stack push/pop | - | O(1) |
| Queue enqueue/dequeue | - | O(1) |
| Linked List search | - | O(n) |
| Graph Traversal | BFS | O(V + E) |
| Graph Traversal | DFS | O(V + E) |
