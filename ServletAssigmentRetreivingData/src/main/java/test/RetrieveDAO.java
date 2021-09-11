package test;
import java.sql.*;
import javax.servlet.*;
public class RetrieveDAO {
	ResultSet rst=null;
	public ResultSet retrieve(ServletRequest req) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT *FROM BOOK31 WHERE BCODE=?");
			ps.setString(1, req.getParameter("BCODE"));
			rst=ps.executeQuery();
		}catch(SQLException e) {e.printStackTrace();}
		return rst;
	}
	

}
