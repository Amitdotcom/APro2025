package com.techlabs.test;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		int numberOfStudents = scanner.nextInt();
		scanner.nextLine();
		
		StudentDetails[] students = new StudentDetails[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {

			System.out.println("Enter details of Student " + (i + 1) + ":");

			System.out.println("Student name: ");
			String name = scanner.nextLine();

			System.out.println("Roll number: ");
			int roll = scanner.nextInt();
			scanner.nextLine();

			System.out.println("percentage: ");
			double percentage = scanner.nextDouble();
			scanner.nextLine();
			System.out.println(" ");
			
			students[i] = new StudentDetails(name, roll, percentage);
		}

		for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = 0; j < numberOfStudents - 1 - i; j++) {
                if (students[j].getPercentage() < students[j + 1].getPercentage()) {
                    
                    StudentDetails temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
		
		
		System.out.println("Percentage in Descending order: ");
		for (StudentDetails student : students) {
			student.display();
		}
		scanner.close();
	}
}
