package test;
import java.io.*;
@SuppressWarnings({"serial","rawtypes"})
public class ProductBean implements Serializable,Comparable{
	private String pCode,pName;
	private float pPrice;
	private int pQty;
	public ProductBean() {}
	public final String getpCode() {
		return pCode;
	}
	public final void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public final String getpName() {
		return pName;
	}
	public final void setpName(String pName) {
		this.pName = pName;
	}
	public final float getpPrice() {
		return pPrice;
	}
	public final void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	public final int getpQty() {
		return pQty;
	}
	public final void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public int compareTo(Object o) {
		ProductBean pb=(ProductBean)o;
		int z=pCode.compareTo(pb.pCode);
		if(z==0) {
			return 0;
		}else if(z>0){
			return -1;
			
		}else {
			return -1;
		}
	}

}
