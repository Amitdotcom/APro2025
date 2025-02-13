package com.techlabs;

import java.util.Scanner;

public class Info {
public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        scanner.nextLine(); // Consume newline left-over
	        System.out.print("Enter your address: ");
	        String address = scanner.nextLine();

	        System.out.println("\nName: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);

	        scanner.close();
	    }
	}
