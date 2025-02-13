package com.techlabs;

public class CallStackExample {
	public static void main(String[] args) {

		System.out.println("Main Starts");
		function1();
		System.out.println("Main ends");
	}

	public static void function1() {
		System.out.println("Function 1 starts");
		function2();
		System.out.println("Function 1 ends");
	}

	public static void function2() {
		System.out.println("Function 2 starts");
		function3();
		System.out.println("Function 2 ends");
	}

	public static void function3() {
		System.out.println("Function 3 starts");
	}
}
