package org.sdet.java8.lambda;

public class GenericFunctionDemo {
    public static void main(String[] args) {
        GenericFun<String> reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            return result.toString();
        };
        System.out.println(reverse.func("apple"));

        GenericFun<Integer> factorial = (number) -> {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.func(5));
    }
}
