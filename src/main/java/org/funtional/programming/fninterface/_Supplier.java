package org.funtional.programming.fninterface;

import java.util.function.Supplier;

public class _Supplier {
    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
