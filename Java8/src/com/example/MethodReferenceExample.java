package com.example;

interface Sumable {
     void m2(int i);
}
public class MethodReferenceExample {
    public static void m1() {
        for(int i=0; i<10; i++) {
            System.out.println("Child thread " + i);
        }
    }

    public int m3(int i) {
        System.out.println("i=" + i);
        return i;
    }

    public static void main(String[] args) {
        Runnable r = MethodReferenceExample :: m1;
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main thread " + i);
        }

        MethodReferenceExample methodReferenceExample = new MethodReferenceExample();

        // For assigning method reference to functional interface only argument types should be same
        // Return type and method name (Method signature can be different)
        Sumable sumable = methodReferenceExample::m3;
        sumable.m2(20);

    }

}
