package maccess;
import java.sql.*;
public class BatchProcessingStatement {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			Statement stm=con.createStatement();
			stm.addBatch("insert into Bank31 values(51865,'NAVEN',666,'CURRENT')");
			stm.addBatch("insert into PRODUCT31 values('A1245','parleg',50,10)");
			stm.addBatch("insert into book31 values('AND3Y2','nikah',525,855)");
			int k[]=stm.executeBatch();
			for(int i=0;i<k.length;i++) {
				System.out.println("Record inserted successfulyy......");
			}
			con.close();
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
