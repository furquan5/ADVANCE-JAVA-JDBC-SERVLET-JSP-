package maccess;
import java.sql.*;
public class BatchProcessingPreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps=con.prepareStatement("INSERT INTO PRODUCT31 VALUES(?,?,?,?)");
			ps.setString(1, "A125");
			ps.setString(2, "JUICE");
			ps.setFloat(3, 100);
			ps.setInt(4, 10);
			ps.addBatch();
			
			
			ps.setString(1, "A126");
			ps.setString(2, "KELA");
			ps.setFloat(3, 500);
			ps.setInt(4, 20);
			ps.addBatch();
			
			int k[]=ps.executeBatch();
			if(k.length==2) {
				System.out.println("Record inserted successfully.......");
			}
			con.close();
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
