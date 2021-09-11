package maccess;
import java.util.*;
import java.io.*;
import java.sql.*;
public class CharacterStream2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the id");
			String id=s.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps=con.prepareStatement("SELECT *FROM CHARTAB31 WHERE ID=?");
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Clob c=rs.getClob(2);
				Reader r=c.getCharacterStream();
				System.out.println("ENter fpath & fName(Destination)");
				File f=new File(s.nextLine());
				FileWriter fw=new FileWriter(f);
				int ch;
				while((ch=r.read())!=-1) {
					fw.write(ch);
					
				}
				System.out.println("FIle retrived successfully....");
				fw.close();
			}
			else {
				System.out.println("Invalid input......");
			}
			
			
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			s.close();
		}
		
	}
}
