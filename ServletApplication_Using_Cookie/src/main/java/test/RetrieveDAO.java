package test;
import java.sql.*;
import java.util.*;
public class RetrieveDAO {
	public ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrieve(){
		try{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("select * from Product31");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ProductBean pb = new ProductBean();
				pb.setpCode(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setpPrice(rs.getFloat(3));
				pb.setpQty(rs.getInt(4));
				al.add(pb);
			}//end of loop
		}catch(Exception e){e.printStackTrace();}
		return al;

	}
}
