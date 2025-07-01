package Polymorphism.Overloadingexample;

public class Person {
private int pid;
private String name;
private String city;

public Person() {
	this.pid=100;
	this.name="vijay";
	this.city="madurai";
}

public Person(int pid,String name) {
	this.pid=pid;
	this.name=name;
	this.city="chennai";
}
public Person(int pid,String name, String city) {
	this.pid=pid;
	this.name=name;
	this.city=city;
}

@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
}


}