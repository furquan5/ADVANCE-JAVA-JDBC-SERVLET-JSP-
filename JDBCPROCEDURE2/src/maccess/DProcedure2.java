package maccess;
import java.util.*;
import java.sql.*;
public class DProcedure2 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the acc number");
			long ACCNO=Long.parseLong(s.nextLine());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call RETRIEVEACCOUNT31(?,?,?,?,?,?)}");
			cs.setLong(1,ACCNO);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3, Types.FLOAT);
			cs.registerOutParameter(4,Types.VARCHAR);
			cs.registerOutParameter(5,Types.VARCHAR);
			cs.registerOutParameter(6,Types.BIGINT);
			cs.execute();
			System.out.println("=====Bank account details========");
			System.out.println("Account number"+" "+ ACCNO);
			System.out.println("Customer Name"+" "+cs.getString(2));
			System.out.println("Balance"+" "+cs.getFloat(3));
			System.out.println("Account Type"+" "+cs.getString(4));
			System.out.println("Address"+" "+cs.getString(5));
			System.out.println("Phone Number"+" "+cs.getLong(6));
			con.close();
			s.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
