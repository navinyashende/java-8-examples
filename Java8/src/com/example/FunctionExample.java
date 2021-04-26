package com.example;

import java.util.function.Function;

/**
 * Function interface has only one method apply
 * Accepts only one argument and can return any type
 */
public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> stringLengthFunction = (s) -> s.length();
        System.out.println(stringLengthFunction.apply("Hello"));
        System.out.println(stringLengthFunction.apply("World!!"));
    }
}
