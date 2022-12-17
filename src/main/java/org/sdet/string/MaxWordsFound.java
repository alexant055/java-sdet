package org.sdet.string;

public class MaxWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0;

        for (String sentence : sentences) {
            if (sentence.split(" ").length > max)
                max = sentence.split(" ").length;
        }

        System.out.println(max);
    }
}
