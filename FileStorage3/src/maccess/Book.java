package maccess;
import java.io.*;
public class Book implements Serializable{
	public String bCode,bName;
	public Book(String bCode,String bName) {
		this.bCode=bCode;
		this.bName=bName;
	}
	public void getBook() {
		System.out.println("Book Code:"+bCode+"\nBook Name:"+bName);
	}

}
