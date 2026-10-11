package com.cit300.analyzer;

import java.util.Arrays;

public class SearchingOperations {
    private int[] data;

    public void setData(int[] arr) {
        this.data = Arrays.copyOf(arr, arr.length);
    }

    public void linearSearch(int target, PerformanceTracker tracker) {
        tracker.reset(); tracker.startTimer();
        for (int i = 0; i < data.length; i++) {
            tracker.incrementStep();
            if (data[i] == target) {
                tracker.stopTimer();
                System.out.printf("Linear: found at index %d | steps=%d | time=%.4f ms%n",
                        i, tracker.getSteps(), tracker.getTimeMs());
                return;
            }
        }
        tracker.stopTimer();
        System.out.println("Linear: not found | steps=" + tracker.getSteps());
    }

    public void binarySearch(int target, PerformanceTracker tracker) {
        int[] sorted = Arrays.copyOf(data, data.length);
        Arrays.sort(sorted);
        tracker.reset(); tracker.startTimer();
        int low = 0, high = sorted.length - 1;
        while (low <= high) {
            tracker.incrementStep();
            int mid = (low + high) / 2;
            if (sorted[mid] == target) {
                tracker.stopTimer();
                System.out.printf("Binary: found at sorted index %d | steps=%d | time=%.4f ms%n",
                        mid, tracker.getSteps(), tracker.getTimeMs());
                return;
            } else if (sorted[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        tracker.stopTimer();
        System.out.println("Binary: not found | steps=" + tracker.getSteps());
    }
}