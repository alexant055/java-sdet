package org.funtional.programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.funtional.programming.streams._Streams.Gender.*;

public class _Streams {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Benita", FEMALE),
                new Person("Ram", MALE),
                new Person("Bob", PREFER_NOT_TO_SAY),
                new Person("Anto", MALE));

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean containsOnlyFemale = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(containsOnlyFemale);

        boolean containsFemale = people.stream()
                .anyMatch(person -> person.gender.equals(FEMALE));
        System.out.println(containsFemale);
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
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
