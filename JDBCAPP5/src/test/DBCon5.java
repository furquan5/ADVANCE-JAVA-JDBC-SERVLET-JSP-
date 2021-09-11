package test;
import java.util.*;
import java.sql.*;
public class DBCon5 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the book code");
			String BCODE=s.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps1=con.prepareStatement("SELECT *FROM BOOK31 WHERE BCODE=?");
			ps1.setString(1, BCODE);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
				PreparedStatement ps2=con.prepareStatement("DELETE FROM BOOK31 WHERE BCODE=?");
				ps2.setString(1,BCODE);
				int k=ps2.executeUpdate();
				if(k>0) {
					System.out.println("Deleted successfully......");
				}
				else {
					System.out.println("Invalid input.......");
				}
			}
			con.close();
			s.close();
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
