package maccess;
import java.util.*;
import java.io.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class BinaryStream2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the id");
			String id=s.nextLine();
					
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","MANAGER");
			PreparedStatement ps=con.prepareCall("Select *from BinaryTab31 where id=?");
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Blob b=rs.getBlob(2);
				byte by[]=b.getBytes(1,(int)b.length());
				System.out.println("ENter the fpath & fName (destination)");
				File f=new File(s.nextLine());
				FileOutputStream fos=new FileOutputStream(f);
				fos.write(by);
				System.out.println("Binary stream retrieved sucessfully...");
				fos.close();
				
			}
			else {
				System.out.println("Invalid id....");
			}
			con.close();
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			s.close();
		}
	}

}
