package com.techlabs.test;

class Student2 {
    private String name;
    private int rollNo;

    public Student2(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

public class ToStringOverride {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Amit", 101);
        System.out.println(s1.toString()); 
    }
}

