package com.techlabs.model;

public class CallStackExample {
    public static void main(String[] args) {
        System.out.println("Main starts");
        functionA();
        System.out.println("Main ends");
    }

    public static void functionA() {
        System.out.println("Inside functionA");
        functionB();
        System.out.println("Exiting functionA");
    }

    public static void functionB() {
        System.out.println("Inside functionB");
        functionC();
        System.out.println("Exiting functionB");
    }

    public static void functionC() {
        System.out.println("Inside functionC");
    }
}

