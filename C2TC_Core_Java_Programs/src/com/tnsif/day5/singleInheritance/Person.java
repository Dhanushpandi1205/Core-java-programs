
// This program to demonstrate the Person
package com.tnsif.day5.singleInheritance;

public class Person {

	
	private String name;
	private  int Id;
	private String city;
	// default constructor
	public Person(){
		System.out.println("Default constructor executed");
	}
	// parameterized constructor
	public Person(String name,int Id,String city) {
		this.name = name;
		this.Id=Id;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", Id=" + Id + ", city=" + city + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getCity()=" + getCity() + "]";
	}
	
}


