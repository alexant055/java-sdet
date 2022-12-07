package org.sdet.java8.lambda.fn.interace;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Alexander"));

        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");
        cities.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
