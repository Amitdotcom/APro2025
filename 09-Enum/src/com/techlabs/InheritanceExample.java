package com.techlabs;

class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Parent method
        obj.show();    // Child method
        
    }
}

