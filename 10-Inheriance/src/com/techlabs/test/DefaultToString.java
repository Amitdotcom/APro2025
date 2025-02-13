package com.techlabs.test;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class DefaultToString {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 101);
        System.out.println(s1.toString());  // Calls toString() implicitly
    }
}

