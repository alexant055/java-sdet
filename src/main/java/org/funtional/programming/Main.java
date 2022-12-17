package org.funtional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.funtional.programming.Main.Gender.FEMALE;
import static org.funtional.programming.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Benita", FEMALE),
                new Person("Ram", MALE),
                new Person("Anto", MALE));

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female.toString());
        }

        // Declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
