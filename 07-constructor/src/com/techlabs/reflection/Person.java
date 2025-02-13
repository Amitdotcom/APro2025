package com.techlabs.reflection;

import java.lang.reflect.*;

public class Person extends Parent {

	String name;

	public void show() {

	}

	public void display()
	{

	}

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public static class ReflectDemo {
		public static void main(String[] args) throws ClassNotFoundException {

			// to get information about constructors

			Class c4 = Person.class;
			Constructor cons[] = c4.getDeclaredConstructors();

			Parameter[] parameters = cons.getParameters();
			for(Parameter parameter : cons) {
                System.out.println("Constructor's parameter : "+parameter);
            }
			
			
			for (Constructor con : cons) {
				System.out.println("Method Name: " + con); // not a good practice
				System.out.println("Method name: " + con.getName()); // best practice
			}

			Field fields[] = c4.getDeclaredFields();
			for (Field field : fields) {
				System.out.println("Field Name: " + field); // not a good practice
				System.out.println("Field name: " + field.getName()); // best practice
			}
			
			
			
			Person p = new Person();
			Class c1 = p.getClass(); // create object using get class method
			Class c2 = Person.class; // create class using .class extension
			Class c3 = Class.forName("com.techlabs.reflection.Person");
			System.out.println(c1.getName());
			System.out.println(c2.getName());
			System.out.println(c3.getName());
			// Or

			String name = c1.getName();
			System.out.println(name);

			// to get method names of a class

			Method methods[] = c1.getDeclaredMethods();

			// to travesre
			for (Method m : methods) {
				System.out.println("Method Name: " + m); // not a good practice
				System.out.println("Method name: " + m.getName()); // best practice
			}

			// to get superclass
			Class superClass = c1.getSuperclass();

			System.out.println(superClass); // returns with class
			System.out.println(superClass.getName()); // returns ony the name of superclass

		}
	}
}