package org.funtional.programming.fninterface;

import java.util.function.BiFunction;

public class _BiFunction {
    static BiFunction<Integer, Integer, Integer> incrementMultiplyFunction = (addTo, multiplyBy) -> (addTo + 2) * multiplyBy;

    public static void main(String[] args) {
        // Legacy
        // (5+1)*10 = 60
        int incM = incrementMultiply(5, 10);
        System.out.println(incM);

        // functional interface
        // (2+2)*6 = 24
        int incMultiplyFnVal = incrementMultiplyFunction.apply(2, 6);
        System.out.println(incMultiplyFnVal);
    }

    static int incrementMultiply(int addTo, int multiplyBy) {
        return (addTo + 1) * multiplyBy;
    }
}
