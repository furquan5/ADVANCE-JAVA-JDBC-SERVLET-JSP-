package test;
import java.util.*;
import java.sql.*;
public class DBCon6 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the boook code");
			String BCODE=s.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps=con.prepareStatement("SELECT *FROM BOOK31 WHERE BCODE=?");
			ps.setString(1, BCODE);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
				
			}
			else {
				System.out.println("Invalid input");
			}
			con.close();
			s.close();
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
