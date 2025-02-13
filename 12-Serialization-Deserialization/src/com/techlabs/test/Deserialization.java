package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.model.Employee;

public class Deserialization {
public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
	
	String file = "C:\\Users\\Admin\\OneDrive - Swabhav Techlabs Solutions Pvt. Ltd\\Desktop\\aurionpro\\ser.txt";
	
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	Employee emp = (Employee)ois.readObject();
	System.out.println("id: "+emp.id);
	System.out.println("name: "+emp.name);
	
	ois.close();
	fis.close();
}
}
