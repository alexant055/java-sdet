package org.sdet.numbers;

public class NearestPrimeNumber {

    public static void main(String[] args) {
        System.out.println(nearestPrimeNumber(202));
    }

    static int nearestPrimeNumber(int number) {
        int result = 1;

        for (int i = 1; i < 10; i++) {
            result = isPrime(number + i) ? number + i : isPrime(number-i) ? number - 1 : -1;

            if (result != -1) break;
        }

        return result;
    }

    static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        // Check if n=2 or n=3
        if (number == 2 || number == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (number % 2 == 0 || number % 3 == 0)
            return false;

        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(number); i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0)
                return false;

        return true;
    }
}
