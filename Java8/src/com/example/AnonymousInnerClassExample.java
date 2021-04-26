package com.example;

interface MyInterface {
    void print();
}
public class AnonymousInnerClassExample {

    int x = 123;

    public static void main(String[] args) {
        // Implementation of Runnable using Lambda
        Thread t = new Thread(() -> { System.out.println("Executing run method using Lambda Implementation");});
        t.start();

        // Implementation of Runnable using Anonymous inner class
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing run method using Anonymous Inner class Implementation");
            }
        });
        t2.start();

        AnonymousInnerClassExample obj = new AnonymousInnerClassExample();
        obj.printValue();
    }

    public void printValue() {
        // This implementation can have only 1 method i.e. SAM
        MyInterface myInterface = () -> {
            int x = 567;
            System.out.println(x); // Local variable
            System.out.println(this.x); // this refers to outer class variable
        };
        myInterface.print();

        // This implementation can extend other classes as well as have multiple abstract methods
        MyInterface myInterface1 = new MyInterface() {
            int x = 20;
            @Override
            public void print() {
                System.out.println(x);
                System.out.println(this.x); // this refers to current class variables
            }

        };
        myInterface1.print();
    }
}
