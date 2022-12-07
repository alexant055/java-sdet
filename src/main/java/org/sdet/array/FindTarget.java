package org.sdet.array;

import java.util.*;

public class FindTarget {
    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 6, 1, 3, 9, 0};
        int target = 9;

        System.out.println(findTargetSum(array, target));
    }

    private static List<List<Integer>> findTargetSum(int[] array, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int S = target - array[i];

            if (map.containsKey(S)) {
                list.add(Arrays.asList(map.get(S), i));
            } else {
                map.put(array[i], i);
            }
        }
        return list;
    }
}
