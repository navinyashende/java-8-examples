package com.example;

@FunctionalInterface
interface MyFuncInterface {
    void m1();
}

@FunctionalInterface
interface MyFuncInterface2 extends MyFuncInterface {
    // void m2(); Cannot introduce an additional method with different method signature

    // Can introduce any number of static or default methods
    static void m3() { System.out.println("Calling MyFuncInterface2 m3");}

    default void m4() { System.out.println("Calling MyFuncInterface2 m4");}

}

public class FunctionInterfaceExample {

    public static void main(String[] args) {
        MyFuncInterface myFuncInterface = () -> { System.out.println("Calling MyFuncInterface m1");};
        MyFuncInterface2 myFuncInterface2 = () -> { System.out.println("Calling MyFuncInterface2 m1");};
        myFuncInterface.m1();
        myFuncInterface2.m1();
        myFuncInterface2.m1();
        MyFuncInterface2.m3();
        // myFuncInterface2.m3(); Compile time error static method can be invoked using class name of interface only
        myFuncInterface2.m4();
    }
}
