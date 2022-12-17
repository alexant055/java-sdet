package org.sdet.string;

import java.util.Arrays;
import java.util.List;

public class ClosestStrings {
    public static void main(String[] args) {
        List<String> S = Arrays.asList("the", "quick", "brown", "fox", "quick");
        String word1 = "the";
        String word2 = "fox";

        System.out.println(shortestDistance(S, word1, word2));
    }

    static int shortestDistance(List<String> s, String word1, String word2) {
        return -1;
    }
}
