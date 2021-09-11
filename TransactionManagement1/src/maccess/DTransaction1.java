package maccess;
import java.util.*;
import java.sql.*;
public class DTransaction1 {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","MANAGER");
			PreparedStatement ps1=con.prepareStatement("select *from bank31 where accno=?");
			PreparedStatement ps2=con.prepareStatement("update bank31 set bal=bal+? where accno=?");
			con.setAutoCommit(false);//step 1
			Savepoint s1=con.setSavepoint();//step 2
			System.out.println("Enter account number :(Home account number)");
			long hAccNo=s.nextLong();
			ps1.setLong(1, hAccNo);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next()) {
				float bal=rs1.getFloat(3);
				System.out.println("Enter beneficiary account number :");
				long bAccNo=s.nextLong();
				ps2.setLong(2, bAccNo);
				ResultSet rs2=ps1.executeQuery();
				if(rs2.next()) {
					System.out.println("Enter the amount to be transfered.");
					int amt=s.nextInt();
					if(amt<=bal) {
						ps2.setInt(1, -amt);
						ps2.setLong(2, hAccNo);
						int i=ps2.executeUpdate();
						
						ps2.setInt(1, amt);
						ps2.setLong(2, bAccNo);
						int j=ps2.executeUpdate();
						
						
						if(i==1 && j==1) {
							System.out.println("Transaction Successful....");
							con.commit(); //step 3
						}
						else {
							System.out.println("Transaction Failed...");
							con.rollback(s1); //step 4
						}
					}
					else {
						System.out.println("Insufficient funds ....");
					}
				}
				else {
					System.out.println("Invalid beneficiary account number....");
				}
			}
			else {
				System.out.println("Invalid Home account number...");
			}
			con.close();
			s.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
