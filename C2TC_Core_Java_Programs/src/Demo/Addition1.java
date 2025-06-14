package Demo;

public class Addition1 {

	private int a ,b,c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Addition1 [a=" + a + ", b=" + b + ", c=" + (a+b) + "]";
	}
	
	
	
}
