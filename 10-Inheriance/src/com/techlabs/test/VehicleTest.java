package com.techlabs.test;

import com.techlabs.model.Bike;
import com.techlabs.model.Car;
import com.techlabs.model.Scooty;
import com.techlabs.model.Vehicle;

public class VehicleTest {
	public static void main(String[] args) {

		Car car = new Car();
		car.start();
		car.drive();
		car.stop();

		Bike bike = new Bike();
		bike.start();
		bike.ride();
		bike.stop();

	}
}
