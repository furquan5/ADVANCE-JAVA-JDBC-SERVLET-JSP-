package test;
import java.sql.*;
public class DBCon2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("SELECT *FROM BOOK31");
			System.out.println("======The result of Book31=======");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
			}
			con.close();
			
		}catch(Exception e) {e.printStackTrace();}
	}

}
