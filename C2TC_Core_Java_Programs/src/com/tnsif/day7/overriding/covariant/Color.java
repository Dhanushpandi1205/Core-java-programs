package com.tnsif.day7.overriding.covariant;

class Color {
	protected Color getColor() {
		Color s = new Color();
		return s;
	}
}

//this class will inherit from the class color and will override the getcolor() method returning the object of the type red class
class Red extends Color {
	@Override
	public Red getColor() {
		Red s = new Red();
		return s;
	}
}



