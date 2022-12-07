package org.sdet.basic;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(4));
        System.out.println(findFactorial(6));
    }

    static int findFactorial(int number) {
        return IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
    }
}
