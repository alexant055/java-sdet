package org.sdet.string;

public class Palindrome {

    public static void main(String[] args) {
        String str = "AMMA";

        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 1; i <= len / 2; i++)
            if (str.charAt(i - 1) != str.charAt(len - i))
                return false;
        return true;
    }
}
