package com.techlabs.test;

public class ThrowsExample {
	static void divide() throws ArithmeticException {
		int num = 10 / 0;
	}

	public static void main(String[] args) {
		try {
			divide();
		} catch (ArithmeticException e) {
			System.out.println("Exception handled.");
		}
	}
}
