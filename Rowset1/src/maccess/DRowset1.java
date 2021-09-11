package maccess;
import java.sql.*;
import javax.sql.rowset.*;
public class DRowset1 {
	public static void main(String[] args) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			JdbcRowSet jrs=RowSetProvider.newFactory().createJdbcRowSet();
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jrs.setUsername("system");
			jrs.setPassword("MANAGER");
			jrs.setCommand("select *from product31");
			jrs.execute();
			
			
			System.out.println("======Normal Display======");
			while(jrs.next()) {
				System.out.println(jrs.getString(1)+"\t"+jrs.getString(2)+"\t"+jrs.getFloat(3)+"\t"+jrs.getInt(4));
			}//end of loop
			System.out.println("=========Reverse Display()==========");
			jrs.afterLast();
			while(jrs.previous()) {
				System.out.println(jrs.getString(1)+"\t"+jrs.getString(2)+"\t"+jrs.getFloat(3)+"\t"+jrs.getInt(4));
			}
			
			
			
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
