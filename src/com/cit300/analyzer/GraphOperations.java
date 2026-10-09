package com.cit300.analyzer;

import java.util.*;

public class GraphOperations {
    private Map<String, List<String>> adj = new LinkedHashMap<>();

    public void addVertex(String v) {
        if (adj.containsKey(v)) { System.out.println("Vertex already exists."); return; }
        adj.put(v, new ArrayList<>());
        System.out.println("Vertex added: " + v);
    }

    public void addEdge(String u, String v) {
        if (!adj.containsKey(u) || !adj.containsKey(v)) {
            System.out.println("Both vertices must exist first.");
            return;
        }
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected
        System.out.println("Edge added: " + u + " <-> " + v);
    }

    public void display() {
        if (adj.isEmpty()) { System.out.println("Graph is empty."); return; }
        System.out.println("Adjacency List:");
        for (Map.Entry<String, List<String>> e : adj.entrySet()) {
            System.out.println("  " + e.getKey() + " -> " + e.getValue());
        }
    }

    public void bfs(String start, PerformanceTracker tracker) {
        if (!adj.containsKey(start)) { System.out.println("Start vertex not found."); return; }
        tracker.reset(); tracker.startTimer();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        visited.add(start); q.add(start);
        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            tracker.incrementStep();
            String cur = q.poll();
            System.out.print(cur + " ");
            for (String n : adj.get(cur)) {
                if (!visited.contains(n)) { visited.add(n); q.add(n); }
            }
        }
        tracker.stopTimer();
        System.out.printf("%n(steps=%d, time=%.4f ms)%n", tracker.getSteps(), tracker.getTimeMs());
    }

    public void dfs(String start, PerformanceTracker tracker) {
        if (!adj.containsKey(start)) { System.out.println("Start vertex not found."); return; }
        tracker.reset(); tracker.startTimer();
        Set<String> visited = new HashSet<>();
        System.out.print("DFS: ");
        dfsRec(start, visited, tracker);
        tracker.stopTimer();
        System.out.printf("%n(steps=%d, time=%.4f ms)%n", tracker.getSteps(), tracker.getTimeMs());
    }

    private void dfsRec(String v, Set<String> visited, PerformanceTracker tracker) {
        visited.add(v);
        tracker.incrementStep();
        System.out.print(v + " ");
        for (String n : adj.get(v)) if (!visited.contains(n)) dfsRec(n, visited, tracker);
    }

    public Set<String> getVertices() { return adj.keySet(); }
}