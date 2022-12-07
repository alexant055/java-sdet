package org.sdet.string;

public class StringAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("word", "wrdo"));
        System.out.println(isAnagram("boat", "btoa"));
        System.out.println(isAnagram("ccc", "ccccccc"));
    }

    private static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length())
            return false;

        char[] wordArray = word.toCharArray();

        for (char c : wordArray) {
            int index = anagram.indexOf(c);

            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else
                return false;
        }

        return anagram.isEmpty();
    }
}
