package org.funtional.programming.fninterface;

import java.util.function.Function;

public class _Function {

    static Function<Integer, Integer> incrementByFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    public static void main(String[] args) {
        // Legacy
        int increment = increment(0);
        System.out.println(increment);

        // functional interface
        int inc = incrementByFunction.apply(1);
        System.out.println(inc);

        int incM = multiplyByTenFunction.apply(inc);
        System.out.println(incM);

        // functional interface - chaining
        Function<Integer, Integer> addMultiplyFunction = incrementByFunction.andThen(multiplyByTenFunction);
        int addMultiplyFunctionValue = addMultiplyFunction.apply(2);
        System.out.println(addMultiplyFunctionValue);
    }

    static int increment(int number) {
        return number + 1;
    }
}
