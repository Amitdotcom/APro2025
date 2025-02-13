package com.test;

public class StringClass {
public static void main(String[] args) {

	String s1 = "Amit";
	String s2 ="Amit";
	
//	System.out.println(s1==s2);
//	System.out.println(s1.equals(s2));
//	System.out.println(s1.hashCode());
//	System.out.println(s2.hashCode());
	
	String s3 = new String("Ankit");
	String s4 = new String("Ankit");
	
//	System.out.println(s3.hashCode());
//	System.out.println(s4.hashCode());
//	System.out.println(s3==s4);
//	System.out.println(s3.equals(s4));
	
	String s5 = "AT";
	
	//System.out.println(s5.hashCode());
	
	s5 = "TA";
	//System.out.println(s5.hashCode());
	
	String s = "Hello Word I'm here: ";
	String s8 = "Amit Tiwari";
//    s.concat(" World"); // This doesn't change s, it creates a new string
    
    //System.out.println(s); // Output: Hello
    //System.out.println(s.concat("World"));
    
    System.out.println(s.length());
    System.out.println(s.charAt(4));
    System.out.println(s.compareTo(s5));
    System.out.println(s.contains("here"));
    System.out.println(s.contains("word"));
    
    String ss1 = "Apple";
    String ss2 = "Banana";
    System.out.println(ss2.compareTo(ss1)); 
    
    String str = "Programming";
    System.out.println(str.substring(3));   // Output: gramming
    System.out.println(str.substring(3, 7)); // Output: gram
	
}}
