package org.funtional.programming.fninterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    static BiConsumer<String, Integer> greetCustomerConsumer = (customer, age) ->
            System.out.println("Hello!, " + customer + ". Your age is " + age);

    public static void main(String[] args) {
        // normal java function
        printGreet("Alexander", 32);

        // consumer functional interface
        greetCustomerConsumer.accept("Christina", 31);
    }

    static void printGreet(String name, int age) {
        System.out.println("Hello!, " + name + ". Your age is " + age);
    }
}
