package org.funtional.programming.fninterface;

import java.util.function.Consumer;

public class _Consumer {
    static Consumer<String> greetCustomerConsumer = customer -> System.out.println("Hello!, " + customer);

    public static void main(String[] args) {
        // normal java function
        printGreet("Alexander");

        // consumer functional interface
        greetCustomerConsumer.accept("Christina");
    }

    static void printGreet(String name) {
        System.out.println("Hello!, " + name);
    }
}
