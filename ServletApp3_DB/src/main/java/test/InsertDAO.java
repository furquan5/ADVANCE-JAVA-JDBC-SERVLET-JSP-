package test;
import java.sql.*;
import javax.servlet.*;
public class InsertDAO {
	public int k=0;
	public int insert(ServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Book31 values(?,?,?,?)");
			ps.setString(1,req.getParameter("bcode"));
			ps.setString(2,req.getParameter("bname"));
			ps.setFloat(3,Float.parseFloat(req.getParameter("bqty")));
			ps.setInt(4,Integer.parseInt(req.getParameter("bprice")));
			k = ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

	
}
