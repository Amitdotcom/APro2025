package com.techlabs.pattern;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Batches\\text.txt");


			if (file.createNewFile()) {
				System.out.println("File Created Succesfully");
			} else {
				System.out.println("File already exist");
			}
	
	}
}