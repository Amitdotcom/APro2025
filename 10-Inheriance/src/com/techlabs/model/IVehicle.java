package com.techlabs.model;

public interface IVehicle {

	void start();
	
	abstract void stop();
	
	public abstract void run();
	
	default void display()
	{
		
	}
	
	static void display2()
	{
		
	}
	
	int a=10;
	final int b=10;
	static final int c =10;
	public static final int d=10;
	
	
}
