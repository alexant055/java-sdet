package org.sdet.java8.lambda.method;

public class InstanceMethodRefDemo {
    public static void main(String[] args) {
        String input = "Test static reference method";

        MyOps stringOp = new MyOps();
        String output = stringOp(stringOp::strReverse, input);

        System.out.println(input);
        System.out.println(output);
    }

    static String stringOp(StringFunc sf, String str) {
        return sf.func(str);
    }
}
