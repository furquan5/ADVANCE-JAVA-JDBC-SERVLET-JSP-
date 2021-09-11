package test;
import java.io.Serializable;
@SuppressWarnings("serial")
public class ProductBean implements Serializable{
    private String pCode,pName;
    private float pPrice;
    private int pQty;
    public ProductBean(){}
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
    
}
