package com.techlabs.model;

public class Bike extends Vehicle {

	@Override
	public void stop() {
		System.out.println("Bike starts");
	}

	public void ride() {
		System.out.println("Bike is riding");
	}

	@Override
	public void start() {
		System.out.println("Bike starts");
		
	}

}
