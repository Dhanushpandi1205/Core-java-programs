package EntityClass;

public class id1 {

	private int num;
	private String name;
	
	public int getNum() {
		return num;
	}
	public void setNum( int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName( String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "id1 [Name is " + name + ", age is =" + num + ", getNum()=" + getNum() + ", getName()=" + getName() + "]";
	}
	
	
}
