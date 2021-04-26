package com.example;

interface ConstExInterface {
     void m1(String s);
}

class ConstExImpl {
    String s;

    public ConstExImpl(String s) {
        this.s = s;
        System.out.println("Constructor executed: " + s);
    }
}

/**
 * Constuctor/Method Reference and Lambda are inter changeable
 */
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        ConstExInterface exInterface = (s) -> new ConstExImpl(s);
        exInterface.m1("From Lambda expression");

        ConstExInterface exInterface1 = ConstExImpl :: new;
        exInterface1.m1("From Constructor Reference");
    }
}
