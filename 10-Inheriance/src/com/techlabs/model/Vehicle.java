package com.techlabs.model;

abstract public class Vehicle {

	abstract public void start();
	
	public void stop()
	{
		System.out.println("Vehicle stops");
	}
}
