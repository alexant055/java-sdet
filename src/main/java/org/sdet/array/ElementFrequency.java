package org.sdet.array;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    private static final int DEFAULT_VALUE = 0;
    private static final int ADD_VALUE = 1;

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        printFrequencyElement(arr);
    }

    static void printFrequencyElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            map.put(element, map.getOrDefault(element, DEFAULT_VALUE) + ADD_VALUE);
        }
        map.forEach((key, value) -> System.out.printf("{%n Key: %s%n Value: %s%n}%n", key, value));
    }
}
