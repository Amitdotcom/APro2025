package com.techlabs.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.model.Student;

public class StudentSerialization {
public static void main(String[] args) throws IOException {
	
	Student student = new Student(1,"Amit","Tiwari",5.5);
	Student student2 = new Student(2,"Bala","Bala",10.0);
	
	String fileName = "C:\\Batches\\ser.txt";
	
	FileOutputStream fos = new FileOutputStream(fileName);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(student);
	oos.writeObject(student2);
	
	oos.close();
	fos.close();
	
	System.out.println("Serialization done successfully");
}
}
