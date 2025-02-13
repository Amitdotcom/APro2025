package com.techlabs.test;

public class StudentDetails {
	private String name;
	private int rollNo;
	private double percentage;

	public StudentDetails() {
		this.name = "Unknown";
		this.rollNo = 0;
		this.percentage = 0.0;
	}

	public StudentDetails(String name, int rollNo, double percentage) {
		this.name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;

	}

	public StudentDetails(StudentDetails other) {
		this.name = other.name;
		this.rollNo = other.rollNo;
		this.percentage = other.percentage;
	}

	public void display() {
		System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Percentage: " + percentage);
	}

	public StudentDetails(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setPercentage(double z) {
		this.percentage = percentage;
	}

}
