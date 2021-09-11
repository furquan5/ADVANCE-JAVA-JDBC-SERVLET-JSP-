package test;
import java.sql.*;
import java.util.*;
public class Pooling {
	public String url,uName,pWord;
	public Pooling(String url,String uName,String pWord) {
		this.url=url;
		this.uName=uName;
		this.pWord=pWord;
		
	}
	public Vector<Connection> pool=new Vector<Connection> ();
	public void createConnection() {
		try {
			while(pool.size()<5) {
				System.out.println("Pool is not ful....");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection(url,uName,pWord);
				pool.addElement(con);
				System.out.println(con);
			}//end of loop
			if(pool.size()==5) {
				System.out.println("Pool is Full...");
			}
			
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public synchronized Connection useConnection() {
		Connection con=(Connection)pool.elementAt(0);
		pool.removeElementAt(0);
		return con;
		
	}
	public synchronized void addConnection(Connection con) {
		pool.addElement(con);
		System.out.println("Connection added to pool...");
	}

}

