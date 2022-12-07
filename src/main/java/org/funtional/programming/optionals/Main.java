package org.funtional.programming.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.empty()
                .orElse("default value");
        System.out.println(value);

        Optional.ofNullable("alex@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresent(email -> System.out.println("Sending email to " + email));

        value = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("exception optional"));
        System.out.println(value);
    }
}
