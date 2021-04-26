package com.example;

interface Squarable {
    int square(int a);
}
public class LambdaExample {

    public static void main(String[] args) {
        // Lambda expression for Runnable interface
        Thread t = new Thread(() -> {
            System.out.println("Executing Run method");
        });
        t.start();
        // Lambda expression for a functional interface (SAM - Single Abstract Method)
        Squarable squarable = (a) ->  a * a ;
        System.out.println(squarable.square(5));
    }
}
