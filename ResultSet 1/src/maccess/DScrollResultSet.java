package maccess;
import java.sql.*;
public class DScrollResultSet {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			Statement stm=con.createStatement(1004,1007);
			ResultSet rs=stm.executeQuery("select *from product31 ");
			System.out.println("==========Display in Normal========");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
			}//end of while
			System.out.println("======Display in Reverse======");
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
				
			}//end of while
			PreparedStatement ps=con.prepareStatement("select *from product31",1004,1007);
			ResultSet rs2=ps.executeQuery();
			System.out.println("=========Display row 2...=======");
			rs2.absolute(2);
			System.out.println(rs2.getString(1)+"\t"+rs2.getString(2)+"\t"+rs2.getFloat(3)+"\t"+rs2.getInt(4));
			
			System.out.println("=====Display relative(+2)======= ");
			rs2.relative(+2);
			System.out.println(rs2.getString(1)+"\t"+rs2.getString(2)+"\t"+rs2.getFloat(3)+"\t"+rs2.getInt(4));
			
		}//end of try
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
