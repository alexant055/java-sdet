package org.sdet.java8.lambda.fn.interace;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        whenNamesPresentUseBothConsumer();
    }

    public static void whenNamesPresentUseBothConsumer() {
        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

        Consumer<List<String>> upperCaseConsumer = list -> list.replaceAll(String::toUpperCase);
        Consumer<List<String>> printConsumer = list -> list.forEach(System.out::println);

        upperCaseConsumer.andThen(printConsumer).accept(cities);

        cities.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
