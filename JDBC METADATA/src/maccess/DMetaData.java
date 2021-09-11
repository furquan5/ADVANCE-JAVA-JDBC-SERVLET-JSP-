package maccess;
import java.sql.*;
public class DMetaData {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			DatabaseMetaData dmd=con.getMetaData();
			System.out.println("Driver Name  " +dmd.getDriverName());
			System.out.println("Driver Version "+dmd.getDriverVersion());
			
			PreparedStatement ps1=con.prepareStatement("insert into product31 values(?,?,?,?)");
			ParameterMetaData pmd=ps1.getParameterMetaData();
			System.out.println("parameter count: "+pmd.getParameterCount());
			//System.out.println("parameter type :"+pmd.getParameterType(5));
			
			
			PreparedStatement ps2=con.prepareStatement("select *from product31 where pcode=?");
			ResultSet rs=ps2.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("Column count "+rsmd.getColumnCount());
			
		}catch(Exception e) {e.printStackTrace();}
		

	}

}
