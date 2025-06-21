package com.tnsif.day6;

public class StudentDemo {
	
	static {
		System.out.println("before main");
	}

	public static void main(String[] args) {
		Student st = new Student();
		
        System.out.println(st);
        
    	Student st1 = new Student();
    	 System.out.println(st1);
    	Student st2 = new Student();
    	 System.out.println(st2);
	}

}
