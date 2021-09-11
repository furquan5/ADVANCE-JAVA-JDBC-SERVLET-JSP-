package test;
import java.util.*;
import java.sql.*;
public class DBCon3 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Book code ");
			String BCODE=s.nextLine();
			System.out.println("Enter book name");
			String BNAME=s.nextLine();
			System.out.println("Enter book quantity");
			int BQTY=s.nextInt();
			System.out.println("Enter the book price");
			int BPRICE=s.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps=con.prepareStatement("Insert into book31 values(?,?,?,?)");
			ps.setString(1,BCODE);
			ps.setString(2,BNAME);
			ps.setInt(3,BQTY);
			ps.setInt(4,BPRICE);
			int k=ps.executeUpdate();
			if(k>0) {
				System.out.println("Data inserted successfully.....");
			}
			else {
				System.out.println("Invalid data");
			}
			con.close();
			s.close();
			
			
		}catch(Exception e) {e.printStackTrace();}
	}


	

}
