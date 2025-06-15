package EntityClass;

public class TypeCasting2 {

	

	public static void main(String[] args) {
	TypeCasting1 tc = new TypeCasting1();
	tc.setB((byte)10);
	tc.setB1((byte)90);
	tc.setCh((char)'A');
  
	tc.setCh1((char)tc.getB1());
	tc.setF(22.14f);
	tc.setF2(34.56f);
	tc.setVar1('\u00A7');
	tc.setI((int)tc.getB());
	tc.setI1((int)tc.getF2());
	tc.setI3((int)tc.getCh());
	tc.setI4((int)tc.getVar1());
	tc.setI2((int)tc.getF2());
	tc.setF1(10.52f);
	tc.setL((long)tc.getF1());
	
	System.out.println(tc);
	}

}
