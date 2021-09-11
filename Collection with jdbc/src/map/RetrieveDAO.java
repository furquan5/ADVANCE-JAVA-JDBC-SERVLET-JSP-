package map;
import java.util.*;
import java.sql.*;
public class RetrieveDAO {
	public Map<String,Values> m=null;
	public Map<String,Values> retrieve (int choice){
		try {
			if(choice==1) {
				m=new HashMap<String,Values>();
			}
			if(choice==2) {
				m=new LinkedHashMap<String,Values>();
			}
			if(choice==3) {
				m=new TreeMap<String,Values>();
			}
			if(choice==4) {
				m=new Hashtable<String,Values>();
			}
		
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("Select *from product31");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String str=new String(rs.getString(1));
				Values v=new Values();
				v.setpName(rs.getString(2));
				v.setpPrice(rs.getFloat(3));
				v.setpQty(rs.getInt(4));
				m.put(str, v);
			}
			
		}catch(Exception e) {e.printStackTrace();}
		return m;
	}
}
