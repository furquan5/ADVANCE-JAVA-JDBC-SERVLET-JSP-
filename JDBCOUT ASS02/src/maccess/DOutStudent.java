package maccess;
import java.util.*;
import java.sql.*;
public class DOutStudent {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the roll number");
			int ROLLNO=s.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call RETRIEVESTUDENT31(?,?,?,?,?,?,?,?,?,?)}");
			cs.setInt(1, ROLLNO);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.registerOutParameter(4, Types.VARCHAR);
			cs.registerOutParameter(5, Types.VARCHAR);
			cs.registerOutParameter(6, Types.VARCHAR);
			cs.registerOutParameter(7, Types.INTEGER);
			cs.registerOutParameter(8, Types.INTEGER);
			cs.registerOutParameter(9, Types.INTEGER);
			cs.registerOutParameter(10, Types.VARCHAR);
			cs.execute();
			System.out.println("======student details=====");
			System.out.println("Roll number:"+ROLLNO);
			System.out.println("Student name"+cs.getString(2));
			System.out.println("Branch"+cs.getString(3));
			System.out.println("House number:"+cs.getString(4));
			System.out.println("State name:"+cs.getString(5));
			System.out.println("City name :"+cs.getString(6));
			System.out.println("Pin number:"+cs.getInt(7));
			System.out.println("Total marks:"+cs.getInt(8));
			System.out.println("Percentage:"+cs.getInt(9));
			System.out.println("resulr:"+cs.getString(10));
			con.close();
			s.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
