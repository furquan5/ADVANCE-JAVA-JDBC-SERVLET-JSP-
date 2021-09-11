package maccess;
import java.util.*;
import java.sql.*;
public class DFunction02 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the roll number");
			int ROLLNO=s.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call ?:= getRESULT31(?)}");
			cs.registerOutParameter(1,Types.VARCHAR);
			cs.setInt(2, ROLLNO);
			cs.execute();
			
			System.out.println("The result of student is:"+cs.getString(1));
			s.close();
			con.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
