package com.example;

interface Interf {
    public static void m1() {
        System.out.println("static method in interface");
    };

}
class Client implements Interf {
    // public static void m1() {}  Valid but not overriding

   // void m1(){}  // Valid but not overriding
}
public class StaticMethodExample {
    public static void main(String[] args) {
        Interf client = new Client();
        //  client.m1(); Compile time error
        // Client.m1(); Compile time error
        Interf.m1();
    }
}
