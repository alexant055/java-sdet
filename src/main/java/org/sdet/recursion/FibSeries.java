package org.sdet.recursion;

public class FibSeries {

    public static void main(String[] args) {
        int number = 15;
        System.out.println(fib(number));
        printFib(number);
    }

    private static void printFib(int i) {
        int current = 0;
        int prev = 0;
        System.out.print(current + "\t");
        current = 1;
        for (int j = 0; j < i; j++) {
            System.out.print(current + "\t");
            current = prev + current;
            prev = current - prev;
        }
    }

    private static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
