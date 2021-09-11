package test;
import java.sql.*;
public class DMainClass {
	public static void main(String[] args) {
		try {
			Pooling p=new Pooling("jdbc:oracle:thin:@localhost:1521:xe","System","MANAGER"); //cONSTRUCTOR CALL
			p.createConnection();
			System.out.println("pool Size ="+p.pool.size());
			Connection con=p.useConnection();
			System.out.println("Using :"+con);
			System.out.println("pool Size :"+p.pool.size());
			PreparedStatement ps=con.prepareStatement("select *from product31");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
				
			}//end of while
			p.addConnection(con);
			System.out.println("Pool size ="+p.pool.size());
			
			
		}catch(Exception e) {e.printStackTrace();}

	}

}
