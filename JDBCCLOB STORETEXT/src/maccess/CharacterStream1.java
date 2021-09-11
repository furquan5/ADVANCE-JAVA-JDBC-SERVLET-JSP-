package maccess;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
public class CharacterStream1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("ENter the id");
			String id=s.nextLine();
			System.out.println("Enter fpath (source)");
			File f=new File(s.nextLine());
			FileReader fr=new FileReader(f);
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps=con.prepareCall("insert into CHARTAB31 VALUES(?,?)");
			ps.setString(1, id);
			ps.setCharacterStream(2,fr,(int)f.length());
			int k=ps.executeUpdate();
			if(k>0) {
				System.out.println("Character stream updated sucessfully....");
			}
			con.close();
			fr.close();
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			s.close();
		}

	}

}
