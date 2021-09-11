package maccess;
import java.util.*;
import java.sql.*;
public class DFunction01 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the employee id");
			int EID=s.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call ?:= GETEMP31(?)}");
			cs.registerOutParameter(1,Types.INTEGER);
			cs.setInt(2, EID);
			
			cs.execute();
			System.out.println("Total salary of the employee is:"+cs.getInt(1));
			s.close();
			con.close();
			
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
