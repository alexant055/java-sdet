package org.sdet.string;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String string = "abcabcbb";

        System.out.println(longest(string));
        System.out.println(longest(" "));
        System.out.println(longest("pwwkeww"));
    }

    static int longest(String input) {
        if (input == null || input.trim().isEmpty())
            return -1;

        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (j < input.length()) {
            if(!hashSet.contains(input.charAt(j))) {
                hashSet.add(input.charAt(j));
                j++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(input.charAt(i));
                i++;
            }
        }

        return max;
    }
}
