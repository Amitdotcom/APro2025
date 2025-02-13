package com.techlabs.model;

public class Car extends Vehicle {

	@Override
	public void stop() {
		System.out.println("Car stops");
	}

	@Override
	public void start() {
		System.out.println("Car starts");
	}

	public void drive() {
		System.out.println("car is driving");
	}

}
