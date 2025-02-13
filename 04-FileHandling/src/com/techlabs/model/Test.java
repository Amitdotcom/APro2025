package com.techlabs.model;

import com.techlabs.Student;

public class Test {
	public static void main(String[] args) {

		Student student1 = new Student(); // declaration
		student1.name = "Amit";
		student1.rollNo = 1;
		student1.percentage = 35.35;

		System.out.println(student1.name);

		System.out.println(student1.percentage);

		Student student2 = new Student();
		System.out.println(student2.name);

		System.out.println(student2.percentage);

//		function2(student1);
//
//		System.out.println(student1.name);
//		int x = 5;
//		System.out.println(x);
//
//		function(x);
//		System.out.println(x);

	}

}
