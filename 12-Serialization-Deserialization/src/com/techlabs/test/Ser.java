package com.techlabs.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.techlabs.model.Employee;

public class Ser  {
	public static void main(String[] args) throws IOException {

		Employee employee = new Employee("Amit", 1);

		String fileName = "C:\\Users\\Admin\\OneDrive - Swabhav Techlabs Solutions Pvt. Ltd\\Desktop\\aurionpro\\ser.txt";

		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);

		oos.close();
		fos.close();

		System.out.println("Object saved in file ");

	}
}
