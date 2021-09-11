package test;
import java.util.*;
import java.sql.*;
public class RetrieveDAO {
	public Set<BookBean>s=null;
	public Set<BookBean>retrieve(int choice){
		try {
			if(choice==1) {
				s=new HashSet<BookBean>();
			}
			else if(choice==2) {
				s=new LinkedHashSet<BookBean>();
			}
			else {
				s=new TreeSet<BookBean>();
			}
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("Select *from book31");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				BookBean bb=new BookBean();
				bb.setBCODE(rs.getString(1));
				bb.setBNAME(rs.getString(2));
				bb.setBPRICE(rs.getInt(3));
				bb.setBQTY(rs.getInt(4));
				s.add(bb);
			}//end of loop
			
		}catch(Exception e) {e.printStackTrace();}
		return s;
	
}
}
