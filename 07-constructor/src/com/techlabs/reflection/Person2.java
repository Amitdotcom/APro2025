package com.techlabs.reflection;

import java.lang.reflect.Method;

public class Person2 extends Parent{
	public void show() {

	}

	public static class ReflectDemo {
		public static void main(String[] args) throws ClassNotFoundException {

			Person2 p = new Person2();
			Class c = Person2.class;
			System.out.println(c.getName());

			// Or

			String name = c.getName();
			System.out.println(name);

			// to get method names of a class

			Method methods[] = c.getDeclaredMethods();
			
			// to travesre
			for (Method m : methods) {
				System.out.println("Method Name: " + m);    //not a good practice
				System.out.println("Method name: "+m.getName());   // best practice
			}
			
			// to get superclass
			Class superClass = c.getSuperclass();
			
			System.out.println(superClass);  //returns with class
			System.out.println(superClass.getName()); //returns ony the name of superclass
			
		}
	}
}
