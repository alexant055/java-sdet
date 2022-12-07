package org.sdet.java8.lambda.method;

public class StaticMethodRefDemo {
    public static void main(String[] args) {
        String input = "Test static reference method";
        String output = stringOp(MyStringOps::strReverse, input);

        System.out.println(input);
        System.out.println(output);
    }

    static String stringOp(StringFunc sf, String str) {
        return sf.func(str);
    }
}
