package com.techlabs.test;

import com.techlabs.model.ExcepionPropagationDemo;

public class ExceptionPropagationTest {
	public static void main(String[] args) {

		ExcepionPropagationDemo demo = new ExcepionPropagationDemo();
		try {
		demo.method2();
	}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("Program continues: ");
		}
}
}
