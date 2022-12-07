package org.funtional.programming.fninterface;

import java.util.function.Predicate;

public class _Predicate {

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> (!phoneNumber.startsWith("0") && phoneNumber.length() == 10);

    static Predicate<String> startsWith9 = phoneNumber -> phoneNumber.startsWith("9");

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("9750649002"));

        System.out.println(isPhoneNumberValidPredicate.test("9750649002"));

        System.out.println(isPhoneNumberValidPredicate.and(startsWith9).test("9750649002"));

        System.out.println(isPhoneNumberValidPredicate.and(startsWith9).test("8750649002"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return (!phoneNumber.startsWith("0") && phoneNumber.length() == 10);
    }
}
