package com.techlabs.model;

public class Car implements IVehicle {

	@Override
	public void start() {
		System.out.println("Car starts");
	}

	public void stop() {
		System.out.println("Car stops");
	}

	public void run() {

	}
	
	public void kick()
	{
		System.out.println("Car is cicking");
	}

}
