package Polymorphism.overriding;

public class Square extends Shape{

	
	public Square(float area) {
		super.area=area;
	}
	@override
	public void calArea()
	{
		System.out.println("From square class:"+super.area*super.area);
	}
}
