package org.sdet.java8.lambda;

@FunctionalInterface
public interface NumericFun {
    int func(int n);

    default String defFunc() {
        return "Default function";
    }

    default String defFuncTwo() {
        return "Default function Two";
    }

    static String staticFunc() {
        return "Static Function";
    }
}
