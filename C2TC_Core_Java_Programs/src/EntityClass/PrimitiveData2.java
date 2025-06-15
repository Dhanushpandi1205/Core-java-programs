package EntityClass;

public class PrimitiveData2 {

	public static void main(String[] args) {
		PrimitiveData1  pd = new PrimitiveData1();
		
		pd.setByteMax((byte)127);
		pd.setByteMin((byte) -128);
		pd.setD(3456.14124512345678902345678914f);
		pd.setF(3234.141243278345f);
		pd.setMaxInt( 2147483647);
		pd.setMinInt(-2147483648);
		pd.setMaxLong( 9223372036854775807L);
		pd.setMinLong(-9223372036854775808L);
		pd.setShortMax((short)32767);
		pd.setShortMin((short)-32768);
	
		
		System.out.println(pd);

	}

}
