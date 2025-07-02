package com.tnsif.day11.trycatch;

public class TryCatchExample {
    static int performDivision(int x,int y) {
    	System.out.println("I am in the Method");
    	int z=0;
    	try {
    		System.out.println("I am in try block");
    		z=x/y;
    	}
    	catch(ArithmeticException e){
    		System.out.println("I am in Catch Block: "+e.getMessage());
    		
    	}
    	return z;
    }
    static float performDivision(float a, float b) {
    	return a/b;
    }
}
