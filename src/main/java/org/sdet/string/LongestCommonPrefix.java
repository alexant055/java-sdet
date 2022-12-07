package org.sdet.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr, arr.length));
    }

    static String longestCommonPrefix(String[] arr, int n) {
        if (arr.length == 0) return "-1";

        String prefix = arr[0];
        for (String s : arr) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix.length() > 0 ? prefix : "-1";
    }
}
