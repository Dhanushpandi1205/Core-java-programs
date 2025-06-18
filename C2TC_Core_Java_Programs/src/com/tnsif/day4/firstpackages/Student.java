package com.tnsif.day4.firstpackages;

public class Student {
  
   private static Student s1 = new Student();
   
   private int id;
   private String name;

public static Student getObj() {
	return s1;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name +  "]";
}
private Student() {
	super();
	
}
   
   

   
   
}
