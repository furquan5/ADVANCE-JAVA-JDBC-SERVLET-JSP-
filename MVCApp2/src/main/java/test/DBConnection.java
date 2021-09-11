package test;
import java.sql.*;
public class DBConnection {
     private static Connection con;
     static{
    	 try{
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
    		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
    				 "system","MANAGER");
    	 }catch(Exception e){}
     }//end of block
     public static Connection getCon(){
    	 return con;
     }
}
