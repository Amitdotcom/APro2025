package com.techlabs.test;

public class MultipleCatchExample {
	public static void main(String[] args) {
		try {
			int a = 5 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
