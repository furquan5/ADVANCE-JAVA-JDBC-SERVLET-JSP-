package test;
import java.io.*;
@SuppressWarnings({"serial","rowtypes"})
public class BookBean implements Serializable,Comparable{

	private String BCODE,BNAME;
	private int BQTY,BPRICE;
	public BookBean() {}
	public final String getBCODE() {
		return BCODE;
	}
	public final void setBCODE(String bCODE) {
		BCODE = bCODE;
	}
	public final String getBNAME() {
		return BNAME;
	}
	public final void setBNAME(String bNAME) {
		BNAME = bNAME;
	}
	public final int getBQTY() {
		return BQTY;
	}
	public final void setBQTY(int bQTY) {
		BQTY = bQTY;
	}
	public final int getBPRICE() {
		return BPRICE;
	}
	public final void setBPRICE(int bPRICE) {
		BPRICE = bPRICE;
	}
	public int compareTo(Object o) {
		BookBean bb=(BookBean)o;
		int z=BCODE.compareTo(bb.BCODE);
		if(z==0) {
			return 0;
		}else if(z>0){
			return -1;

		}else {
			return -1;
		}
	}
}



