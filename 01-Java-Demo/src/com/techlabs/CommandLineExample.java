package com.techlabs;

public class CommandLineExample {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CommandLineExample <name> <age>");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}

