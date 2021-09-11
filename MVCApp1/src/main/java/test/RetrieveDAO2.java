package test;
import java.sql.*;
import javax.servlet.http.*;
public class RetrieveDAO2 {
    public ProductBean pb = null;
    public ProductBean retrieve(HttpServletRequest req){
    	try{
    		Connection con=DBConnection.getCon();
    		PreparedStatement ps = con.prepareStatement
    				("select * from Product31 where pcode=?");
    		ps.setString(1,req.getParameter("pcode"));
    		ResultSet rs = ps.executeQuery();
    		if(rs.next()){
    			pb = new ProductBean();
    			pb.setpCode(rs.getString(1));
    			pb.setpName(rs.getString(2));
    			pb.setpPrice(rs.getFloat(3));
    			pb.setpQty(rs.getInt(4));
    		}
    	}catch(Exception e){e.printStackTrace();}
    	return pb;
    }
}
