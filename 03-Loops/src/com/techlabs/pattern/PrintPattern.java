package com.techlabs.pattern;

import java.util.Scanner;

public class PrintPattern {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		byte a =100;
		int b = a;
		long c = b;
		float d = c;
		double e = d;
		
		char ch = 'a';
		int ascii  = ch;
		char ch2 = (char) ascii;
		
		System.out.println(ch);
		System.out.println(ascii);
		
		double num = 99.99;
		int n = (int) num;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);


		System.out.println("Enter number of rows:  ");
		int numOfRows = scanner.nextInt();

		for (int i = 1; i <= numOfRows; i++) {

		for(int j=1; j<=i;j++)
		{
			System.out.print("*  ");
		}
		
		System.out.println();
		}
	}
}
