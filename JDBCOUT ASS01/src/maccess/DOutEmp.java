package maccess;
import java.util.*;
import java.sql.*;
public class DOutEmp {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the employee id");
			int EID=s.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			CallableStatement cs=con.prepareCall("{call RETRIEVEEMPDET31(?,?,?,?,?,?,?,?,?)}");
			cs.setInt(1,EID);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3,Types.VARCHAR);
			cs.registerOutParameter(4,Types.INTEGER);
			cs.registerOutParameter(5,Types.INTEGER);
			cs.registerOutParameter(6,Types.VARCHAR);
			cs.registerOutParameter(7,Types.VARCHAR);
			cs.registerOutParameter(8,Types.VARCHAR);
			cs.registerOutParameter(9,Types.INTEGER);
			cs.execute();
			System.out.println("==============Emp Details========");
			System.out.println("employee ID:"+EID);
			System.out.println("EMPLOYEE NAME"+cs.getString(2));
			System.out.println("employee desg"+cs.getString(3));
			System.out.println("employee basic salary"+cs.getInt(4));
			System.out.println("employee total salary"+cs.getInt(5));
			System.out.println("house number"+cs.getString(6));
			System.out.println("State name"+cs.getString(7));
			System.out.println("city"+cs.getString(8));
			System.out.println("Pincode"+cs.getInt(9));
			con.close();
			s.close();
			
		}catch(Exception e) {e.printStackTrace();}
		

	}

}







//How to create procedure Sample 


//CREATE OR REPLACE PROCEDURE RETRIEVESTUDENT31
//(A NUMBER,B OUT VARCHAR2,C OUT VARCHAR2,D OUT VARCHAR2,E OUT VARCHAR2,F OUT VARCHAR2,G OUT NUMBER,H OUT NUMBER,I OUT NUMBER,J OUT VARCHAR2) IS
//BEGIN
//SELECT STUNAME,BRANCH INTO B,C FROM STUDENTDETAILS31 WHERE ROLLNO=A;
//SELECT HNO,SNAME,CITY,PINCODE INTO D,E,F,G FROM STUDENTADDR31 WHERE ROLLNO=A;
//SELECT TOTMARKS,PER,RESULT INTO H,I,J FROM STUDENTRESULT31 WHERE ROLLNO=A;
//END;
///