package test;
import java.util.*;
import java.sql.*;
public class RetrieveDAO {
	public Set<ProductBean>s=null;
	public Set<ProductBean>retrieve(int choice){
		try {
			if(choice==1) {
				s=new HashSet<ProductBean>();
			}else if(choice==2) {
				s=new LinkedHashSet<ProductBean>();
			}else {
				s=new TreeSet<ProductBean>();
			}

			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select *from Product31");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ProductBean pb=new ProductBean();
				pb.setpCode(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setpPrice(rs.getFloat(3));
				pb.setpQty(rs.getInt(4));
				s.add(pb);
			}//end of loop

		}//end of try
		catch(Exception e) {e.printStackTrace();}
		return s;
	}
}
