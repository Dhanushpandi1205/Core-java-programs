package EntityClass;

public class PrimitiveData1 {
      private byte byteMax,byteMin;
      private short shortMax,shortMin;
      private int maxInt,minInt;
      private long maxLong,minLong;
      private float f;
      private double d;
      private boolean flag;
	
      
      public byte getByteMax() {
		return byteMax;
	}
	public void setByteMax(byte byteMax) {
		this.byteMax = byteMax;
	}
	public byte getByteMin() {
		return byteMin;
	}
	public void setByteMin(byte byteMin) {
		this.byteMin = byteMin;
	}
	public short getShortMax() {
		return shortMax;
	}
	public void setShortMax(short shortMax) {
		this.shortMax = shortMax;
	}
	public short getShortMin() {
		return shortMin;
	}
	public void setShortMin(short shortMin) {
		this.shortMin = shortMin;
	}
	public int getMaxInt() {
		return maxInt;
	}
	public void setMaxInt(int maxInt) {
		this.maxInt = maxInt;
	}
	public int getMinInt() {
		return minInt;
	}
	public void setMinInt(int minInt) {
		this.minInt = minInt;
	}
	public long getMaxLong() {
		return maxLong;
	}
	public void setMaxLong(long maxLong) {
		this.maxLong = maxLong;
	}
	public long getMinLong() {
		return minLong;
	}
	public void setMinLong(long minLong) {
		this.minLong = minLong;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "PrimitiveData1 [byteMax=" + byteMax + ", byteMin=" + byteMin + ", shortMax=" + shortMax + ", shortMin="
				+ shortMin + ", maxInt=" + maxInt + ", minInt=" + minInt + ", maxLong=" + maxLong + ", minLong="
				+ minLong + ", f=" + f + ", d=" + d +  "]";
	}
      
      
}
