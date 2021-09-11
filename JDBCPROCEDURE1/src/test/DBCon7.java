package test;
import java.util.*;
import java.sql.*;
public class DBCon7 {
	public static void main(String args[]) {
		try{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the account number");
			long ACCNO=Long.parseLong(s.nextLine());
			System.out.println("Enter customer name");
			String CUSTNAME=s.nextLine();
			System.out.println("Enter the balance");
			long BAL=Long.parseLong(s.nextLine());
			System.out.println("Enter account type");
			String ACCTYPE=s.nextLine();
			System.out.println("Enter the address");
			String ADDR=s.nextLine();
			System.out.println("Enter the phone number");
			long PHNO=s.nextLong();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call CREATEACCOUNT31(?,?,?,?,?,?)}");
			cs.setLong(1, ACCNO);
			cs.setString(2, CUSTNAME);
			cs.setLong(3, BAL);
			cs.setString(4, ACCTYPE);
			cs.setString(5, ADDR);
			cs.setLong(6, PHNO);
			cs.execute();
			System.out.println("Updates sucessfully");
			con.close();
			s.close();
			
				
		}catch (Exception e) {e.printStackTrace();}
	}
}
