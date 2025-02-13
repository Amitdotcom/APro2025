package com.techlabs.model;

import java.io.Serializable;

public class Student implements Serializable{

	public int id;
	public String firstName;
	public String lastName;
	public double grade;
	
	public Student(int id, String fname, String lname, double grade)
	{
		this.id=id;
		this.firstName=fname;
		this.lastName=lname;
		this.grade=grade;
	}
}
