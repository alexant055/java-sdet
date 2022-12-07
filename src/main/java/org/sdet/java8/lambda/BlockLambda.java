package org.sdet.java8.lambda;

public class BlockLambda {
    public static void main(String[] args) {
        NumericFun factorial;

        factorial = (int n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.func(5));
        System.out.println(factorial.func(3));
        System.out.println(factorial.defFunc());
        System.out.println(factorial.defFuncTwo());
        System.out.println(NumericFun.staticFunc());
    }
}
