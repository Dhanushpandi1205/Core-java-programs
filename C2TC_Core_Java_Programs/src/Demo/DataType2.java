package Demo;

public class DataType2 {

	public static void main(String[] args, float marker) {
		DataType1 n = new DataType1();
		n.setVal1 ( 9 / 2); 
		n.setVal2 (101 / 61);
		n.setVal3 ( 10d / 6d);
		n.setVal4 (5/2.5f);
		n.setMarker(512);
		n.setPercentage(marker * 0.46f);
		
		System.out.println(n);
		
	}

}
