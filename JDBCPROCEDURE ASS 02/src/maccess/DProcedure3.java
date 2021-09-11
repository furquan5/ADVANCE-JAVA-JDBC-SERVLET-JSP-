package maccess;
import java.util.*;
import java.sql.*;
public class DProcedure3 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Roll Number:");
			long ROLLNO=Long.parseLong(s.nextLine());
			System.out.println("Enter the student name");
			String STUNAME=s.nextLine();
			System.out.println("Enter the Branch");
			String BRANCH=s.nextLine();
			System.out.println("Enter house number:");
			String HNO=s.nextLine();
			System.out.println("Enter the state name");
			String SNAME=s.nextLine();
			System.out.println("Enter the City name");
			String CITY=s.nextLine();
			System.out.println("Enter the pin code");
			long PINCODE=Long.parseLong(s.nextLine());
			System.out.println("Enter the total marks:");
			int TOTMARKS=Integer.parseInt(s.nextLine());
			System.out.println("Enter the percentage");
			long PER=Long.parseLong(s.nextLine());
			System.out.println("Enter the result:");
			String RESULT=s.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call INSERTDETAILS31(?,?,?,?,?,?,?,?,?,?)}");
			cs.setLong(1, ROLLNO);
			cs.setString(2,STUNAME);
			cs.setString(3, BRANCH);
			cs.setString(4, HNO);
			cs.setString(5, SNAME);
			cs.setString(6, CITY);
			cs.setLong(7,PINCODE);
			cs.setLong(8, TOTMARKS);
			cs.setLong(9, PER);
			cs.setString(10, RESULT);
			cs.execute();
			System.out.println("Insertion done successfully....");
			con.close();
			s.close();
			
		}catch(Exception e) {e.printStackTrace();}
	}

}
