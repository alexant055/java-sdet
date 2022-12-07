package org.sdet.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DuplicateCharacters {
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("JAva");
        printDuplicateCharacters("");
        printDuplicateCharacters(null);
    }

    private static void printDuplicateCharacters(String inputString) {
        if (inputString == null || inputString.trim().isEmpty())
            return;

        try {
            HashMap<Character, Integer> map = new HashMap<>();

            for (Character character : Objects.requireNonNull(inputString).toLowerCase().toCharArray()) {
                map.put(character, map.getOrDefault(character, 0) + 1);
            }

            map.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .forEach(System.out::println);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
