package test;
import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable{
	private String uName,pWord,fName,lName,addr,mId;
	private long phNO;
	UserBean(){}
	public final String getuName() {
		return uName;
	}
	public final void setuName(String uName) {
		this.uName = uName;
	}
	public final String getpWord() {
		return pWord;
	}
	public final void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public final String getfName() {
		return fName;
	}
	public final void setfName(String fName) {
		this.fName = fName;
	}
	public final String getlName() {
		return lName;
	}
	public final void setlName(String lName) {
		this.lName = lName;
	}
	public final String getAddr() {
		return addr;
	}
	public final void setAddr(String addr) {
		this.addr = addr;
	}
	public final String getmId() {
		return mId;
	}
	public final void setmId(String mId) {
		this.mId = mId;
	}
	public final long getPhNO() {
		return phNO;
	}
	public final void setPhNO(long phNO) {
		this.phNO = phNO;
	}
	
}
