package com.example;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> s.length();
        consumer.accept("Hello");
    }
}
