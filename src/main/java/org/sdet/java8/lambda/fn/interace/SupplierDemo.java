package org.sdet.java8.lambda.fn.interace;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi!";

//        System.out.println(supplier.get());

        List<String> cities = Collections.emptyList();

        System.out.println(cities.stream().findAny().orElseGet(supplier));
    }
}
