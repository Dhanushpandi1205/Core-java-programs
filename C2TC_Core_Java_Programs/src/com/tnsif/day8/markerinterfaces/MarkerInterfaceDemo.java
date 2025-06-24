package com.tnsif.day8.markerinterfaces;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Students s=new Students(101,"Neha",12000,"C++");
		if (s instanceof Registerable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			


	}

}
