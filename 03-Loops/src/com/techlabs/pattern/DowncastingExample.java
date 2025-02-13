package com.techlabs.pattern;

public class DowncastingExample {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        Dog d = (Dog) a; // Downcasting (explicit)
        
        d.makeSound();
        d.bark();
        
        
        
        
        int num = 150;
        byte b = (byte) num;
        
        System.out.println(num);
        System.out.println(b);
        
      
        
        Integer k=10;
        System.out.println(k.TYPE);
    }
}