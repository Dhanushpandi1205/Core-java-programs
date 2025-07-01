package Polymorphism.Overloadingexample;

public class Executor {

	public static void main(String[] args) {
		
    System.out.println("1.Addition:"+overloadingexample.addition("Dhansh"," Pandi"));
    System.out.println("2.Addition:"+overloadingexample.addition(1000,150));
    System.out.println("3.Addition:"+overloadingexample.addition(10.0f,21.00f));
    System.out.println("4.Addition:"+overloadingexample.addition(10.0f,21));
    System.out.println("5.Addition:"+overloadingexample.addition(21,45.0f));
	
	
	Person p1=new Person();
	System.out.println(p1);
	 p1=new Person(200,"Dhanush");
	System.out.println(p1);
	
	 p1=new Person(300,"anush","Chennai");
		System.out.println(p1);
	}

}
