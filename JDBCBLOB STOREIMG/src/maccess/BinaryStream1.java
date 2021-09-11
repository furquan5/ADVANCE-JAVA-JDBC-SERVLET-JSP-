package maccess;
import java.util.*;
import java.sql.*;
import java.io.*;
public class BinaryStream1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the id");
			String id=s.nextLine();
			System.out.println("Enter fpath &fname(source)");
			File f=new File(s.nextLine());
			FileInputStream fis=new FileInputStream(f);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps=con.prepareStatement("insert into BinaryTab31 values(?,?)");
			ps.setString(1,id);
			ps.setBinaryStream(2, fis,(int)f.length());
			int k=ps.executeUpdate();
			if(k>0) {
				System.out.println("Stream Recoded.....");
			}
			con.close();
			fis.close();
			
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			s.close();
		}

	}

}
