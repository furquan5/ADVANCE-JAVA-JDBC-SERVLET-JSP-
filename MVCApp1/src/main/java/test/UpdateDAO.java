package test;
import java.sql.*;
public class UpdateDAO {
     public int k=0;
     public int update(ProductBean pb){
    	 try{
    		 Connection con = DBConnection.getCon();
    		 PreparedStatement ps = con.prepareStatement
    				 ("update Product31 set pprice=?,pqty=? where pcode=?");
    		 ps.setFloat(1,pb.getpPrice());
    		 ps.setInt(2,pb.getpQty());
    		 ps.setString(3,pb.getpCode());
    		 k = ps.executeUpdate();
    	 }catch(Exception e){e.printStackTrace();}
    	 return k;
     }
}
