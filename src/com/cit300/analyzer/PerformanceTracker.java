package com.cit300.analyzer;

public class PerformanceTracker {
    private long steps;
    private long startTime;
    private long endTime;

    public void reset() { steps = 0; startTime = 0; endTime = 0; }
    public void incrementStep() { steps++; }
    public void addSteps(long n) { steps += n; }
    public void startTimer() { startTime = System.nanoTime(); }
    public void stopTimer() { endTime = System.nanoTime(); }
    public long getSteps() { return steps; }
    public double getTimeMs() { return (endTime - startTime) / 1_000_000.0; }
}