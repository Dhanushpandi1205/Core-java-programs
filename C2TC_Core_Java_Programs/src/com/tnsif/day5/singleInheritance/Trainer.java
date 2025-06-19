// This is Demonstrate Trainer subclass 
package com.tnsif.day5.singleInheritance;

public class Trainer extends Person{
  private String designation;
  private String location;
  
  public Trainer(){//default Constructor
	  super();
	  this.designation =" program Trainer";
	  this.location = "Chennai";
  }
  // parameterized Constructor
  public Trainer(int Id,String name,String city,String designation,String location) {
	  super(name,Id,city);
	  this.designation=designation;
	  this.location = location;
  }
  
  
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Trainer [name:"+getName()+ "Id : "+getId()+"city :"+getCity()+ "designation=" + designation + ", location=" + location + "]";
}

  
}
