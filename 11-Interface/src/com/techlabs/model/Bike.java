package com.techlabs.model;

public class Bike implements IVehicle,IElectricVehicle {

	@Override
	public void start() {
		System.out.println("Bike starts");

	}

	@Override
	public void stop() {
		System.out.println("Bike stops");
	}

	@Override
	public void electricStart() {
		System.out.println("Electricc start");
		
	}

}
