package com.techlabs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("C:\\Batches\\AurionPro January 25//text.txt");
			try {

				int i;
				while ((i = file.read()) != -1) {
					System.out.print((char) i);
				}

			} finally {
				file.close();
			}
			System.out.println("Successfully read ");
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
