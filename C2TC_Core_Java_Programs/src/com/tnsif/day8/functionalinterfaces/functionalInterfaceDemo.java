package com.tnsif.day8.functionalinterfaces;

public class functionalInterfaceDemo {

	
	public static void main(String[] args) {
		 GreetClass g = new GreetClass();
		 System.out.println(g.greet());
		 

			//using Lambda Expression
			GreetInterfaces g1 = () -> {
				return "Good Afternoon";
			};

			System.out.println(g1.greet());

	}
}
