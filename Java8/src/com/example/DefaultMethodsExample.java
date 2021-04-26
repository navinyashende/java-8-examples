package com.example;

interface myInterface1 {
    default void m1() {
        System.out.println("myInterface1's implementation of m1");
    }

    // Cannot override object class methods as default method in interface
    /*default void toString() {
        System.out.println("Custom toString implementation");
    }*/
}

interface myInterface2 {
    default void m1() {
        System.out.println("myInterface2's implementation of m1");
    }
}
public class DefaultMethodsExample implements myInterface1, myInterface2{

    public static void main(String[] args) {

    }

    @Override
    public void m1() {
        System.out.println("Overriden implementation of m1 to solve multiple inheritance problem due to default methods");
    }
}
