package com.techlabs.model;

public interface IVehicle {

	void start();

	abstract void stop();

	default void run() {
		System.out.println("Dafault run");
	}

	int numberOfTyres1 = 4;
	final int numberOfTyres2 = 4;
	static final int numberOfTyres3 = 4;
	public static final int numberOfTyres4 = 4;

	static void kick()
	{
		System.out.println("kicking");
	}
}
