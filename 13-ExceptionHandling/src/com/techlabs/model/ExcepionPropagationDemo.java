package com.techlabs.model;

public class ExcepionPropagationDemo {
	public void method1() {
		int num = 10;
		int result = num / 0;
		System.out.println("Result is: " + result);
	}

	public void method2() {
		method1();
	}
}
