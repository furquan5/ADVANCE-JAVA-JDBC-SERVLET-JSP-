package test;
import java.sql.*;
public class DBCon1{
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //step 1
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","MANAGER");//STEP2
			Statement stm=con.createStatement();//step3
			ResultSet rs=stm.executeQuery("select * from Product31"); //step4
			System.out.println("=========Records of Product31======");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
			}
			con.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}
