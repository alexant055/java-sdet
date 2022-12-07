package org.sdet.basic;

import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        System.out.println(9 + (isPrime(9) ? " is a prime number." : " is not a prime number."));
    }

    static boolean isPrime(int number) {
        if (number <= 1) return false;

        return IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }
}
