package com.techlabs.model;

import com.techlabs.Student;

public class StudentTest {

//	public static int function1(int x) {  
//		x = 7;
//		return x;
//	}

//	public static void function2(Student student) {   
//		student.name = "Raghav";
//	}

	public static void main(String[] args) {

		Student student1 = new Student(); // declaration
		student1.name = "Amit";
		student1.rollNo = 1;
		student1.percentage = 35.35;

		System.out.println(student1.name);

//		function2(student1);

		System.out.println(student1.name);
//		int x = 5;
//		System.out.println(x);
//
//		function1(x);
//		System.out.println(x);

	}
}
