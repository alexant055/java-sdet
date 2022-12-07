package org.sdet.java8.lambda.fn.interace;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

        cities.stream()
                .filter(c -> c.equals("New York"))
                .forEach(System.out::println);
    }
}
