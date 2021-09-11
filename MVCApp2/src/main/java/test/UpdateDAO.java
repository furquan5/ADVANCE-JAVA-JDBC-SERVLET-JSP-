package test;
import java.sql.*;
public class UpdateDAO {
    public int k=0;
    public int update(UserBean ub){
    	try{
    		Connection con = DBConnection.getCon();
    		PreparedStatement ps = con.prepareStatement
    			("update UserReg31 set addr=?,phno=?,mid=? where uname=? and pword=?");
    		ps.setString(1,ub.getAddr());
    		ps.setLong(2,ub.getPhNo());
    		ps.setString(3,ub.getmId());
    		ps.setString(4,ub.getuName());
    		ps.setString(5,ub.getpWord());
    		k = ps.executeUpdate();
    	}catch(Exception e){e.printStackTrace();}
    	return k;
    }
}
