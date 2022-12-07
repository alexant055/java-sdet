package org.sdet.java8.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        // declare an interface reference
        MyNumber myNumber;
        // lambda expression is simply a constant expression
        myNumber = () -> 123.5;
        // Call getValue
        System.out.println(myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println(myNumber.getValue());

        // Error
//        myNumber = () => "100";
    }
}
