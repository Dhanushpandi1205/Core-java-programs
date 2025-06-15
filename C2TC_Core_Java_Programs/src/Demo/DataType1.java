package Demo;

public class DataType1 {
	
	private int val1,marker;
	private float val2,val4;
	private double val3,percentage;
	
	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public int getMarker() {
		return marker;
	}
	public void setMarker(int marker) {
		this.marker = marker;
	}
	public float getVal2() {
		return val2;
	}
	public void setVal2(float val2) {
		this.val2 = val2;
	}
	public float getVal4() {
		return val4;
	}
	public void setVal4(float val4) {
		this.val4 = val4;
	}
	public double getVal3() {
		return val3;
	}
	public void setVal3(double val3) {
		this.val3 = val3;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "DataType1 [val1=" + val1 + ", marker=" + marker + ", val2=" + val2 + ", val4=" + val4 + ", val3=" + val3
				+ ", percentage=" + percentage +  "]";
	}
	
	

}
