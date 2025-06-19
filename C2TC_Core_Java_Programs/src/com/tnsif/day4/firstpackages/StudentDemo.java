package com.tnsif.day4.firstpackages;

public class StudentDemo {

	public static void main(String[] args) {
		Student st = Student.getObj();
		
		st.setId(100);
		st.setName("dhanush");
		Student st1 = Student.getObj();
		System.out.println(st);
		System.out.println(st1);

	}

}
