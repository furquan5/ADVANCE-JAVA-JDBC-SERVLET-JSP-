package maccess;
import java.sql.*;
public class DBConnection1 {
	private static Connection con=null;
	private DBConnection1() {}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			
			
		}catch(Exception e) {e.printStackTrace();}
	}
	public static Connection getCon() {
		return con;
	}
}
