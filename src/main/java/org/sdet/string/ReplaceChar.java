package org.sdet.string;

public class ReplaceChar {
    public static void main(String[] args) {
        String input = "I 3$%Lov$e Auto&*(mation";
        String regexPattern = "[^a-zA-Z\\s]";
        input = input.replaceAll(regexPattern, "");

        System.out.println(input);
    }
}
