package org.sdet.basic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(4541));
        System.out.println(isPalindrome(414));
    }

    static boolean isPalindrome(int number) {

        if (number == 0) return false;

        int temp = number;
        int reverseNumber = 0;

        do {
            reverseNumber = reverseNumber * 10 + (temp % 10);
            temp = temp / 10;
        } while (temp > 0);

        return number == reverseNumber;
    }
}
