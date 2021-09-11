package map;
import java.io.*;
public class Values implements Serializable{
	private String pName;
	private Float pPrice;
	private int pQty;
	public Values() {}
	public final String getpName() {
		return pName;
	}
	public final void setpName(String pName) {
		this.pName = pName;
	}
	public final Float getpPrice() {
		return pPrice;
	}
	public final void setpPrice(Float pPrice) {
		this.pPrice = pPrice;
	}
	public final int getpQty() {
		return pQty;
	}
	public final void setpQty(int pQty) {
		this.pQty = pQty;
	}
	

}
