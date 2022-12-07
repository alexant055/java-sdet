package org.sdet.java8.lambda.method;

public class GenericMethodRefDemo {

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 4};
        System.out.println(myOp(MyArrayOps::countMatching, vals, 4));
        String[] stars = {"one", "two", "three", "four", "two", "four", "two"};
        System.out.println(myOp(MyArrayOps::countMatching, stars, "two"));
    }

    static <T> int myOp(Myfunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }
}
