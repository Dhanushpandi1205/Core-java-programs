package com.tnsif.day5.multilevelinheritance;

public class VehicleDemo {

	public static void main(String[] args) {
		
		Car c;
		c=new Car();
		c.vehicleType();
		
		Maruti m=new Maruti();
		m.vehicleType();
		m.brand();
		m.speed();
		
		Maruti800 m1=new Maruti800();
		
		m1.speed();
		
	}

}
