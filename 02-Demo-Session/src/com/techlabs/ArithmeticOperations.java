package com.techlabs;

import java.util.Scanner;

public class ArithmeticOperations {

	public static double sum(double number1, double number2) {
		return number1 + number2;
	}

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter number 1:");
//		double number1 = scanner.nextDouble();
//		
//		System.out.println("Enter number 2:");
//		double number2 = scanner.nextDouble();
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);

		System.out.println("Addition is: " + sum(number1, number2));
	}
}
