package org.sdet.array;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{1, 2, 3, 4, 2, 1}));
    }

    static int findUnique(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return -1;
    }
}
