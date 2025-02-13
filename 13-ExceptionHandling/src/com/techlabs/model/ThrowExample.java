package com.techlabs.model;

public class ThrowExample {
	public int age;
	public void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		} else {
			System.out.println("You can vote");
		}
	}
}
