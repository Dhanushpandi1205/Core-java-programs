package Polymorphism.overriding;

public class Executer {

	public static void main(String[] args) {
		Shape s1= new Shape();
		s1.calArea();
		s1= new Square(4.4f);
		s1.calArea();
		s1= new Rectangle(4.4d,5d);
		s1.calArea();
	}

}
