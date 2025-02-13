package com.techlabs.reflection;
import java.lang.reflect.*;

public class Person {

	String Name;
	int age;

	void display() {

	}

	public Person() {

	}

	public Person(String name, int age) {
		this.Name = name;
		this.age = age;
	}

	public static class ReflectionDemo {
		public static void main(String[] args) {

			Person person = new Person();
			// method 1
			Class c1 = person.getClass();

			// Method 2
//			Class c2= Person.class;

			// method 3
//			Class c3 = Class.forName("com.techlabs.reflection.Person");

//			System.out.println(c1);
			System.out.println("Class name: "+c1.getName());

			Method method[]=c1.getDeclaredMethods();
			
			for(Method m:method)
			{
//				System.out.println("Methods declared: "+m);
				System.out.println("Methods declared: "+m.getName());
			}
		}
	}

}
