package maccess;
import java.util.*;
import java.sql.*;
import test.*;
import java.sql.DriverManager;
public class DProcedureAss01 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Employee id");
			int EID=Integer.parseInt(s.nextLine());
			System.out.println("Enter Employee Name:");
			String ENAME=s.nextLine();
			System.out.println("Enter Employee Designation:");
			String EDESG=s.nextLine();
			System.out.println("Enter Employee Bal:");
			float BSAL=Float.parseFloat(s.nextLine());
			System.out.println("Enter Employee Hhouse number:");
			String HNO=s.nextLine();
			System.out.println("Enter Employee STATE NAME:");
			String SNAME=s.nextLine();
			System.out.println("Enter Employee CITY NAME:");
			String CITY=s.nextLine();
			System.out.println("Enter Employee PINCODE:");
			int PINCODE=Integer.parseInt(s.nextLine());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call INSERTEMP31(?,?,?,?,?,?,?,?)}");
			cs.setInt(1, EID);
			cs.setString(2, ENAME);
			cs.setString(3, EDESG);
			cs.setFloat(4, BSAL);
			cs.setString(5, HNO);
			cs.setString(6, SNAME);
			cs.setString(7, CITY);
			cs.setInt(8, PINCODE);
			cs.execute();
			EmpSalary ob=new EmpSalary();
			ob.getTOTSAL();
			System.out.println("INSERTION DONE SUCCESSFULLY");
			s.close();
			con.close();
		}catch(Exception e) {e.printStackTrace();}
		
			
			
	
	}
			
}

		



