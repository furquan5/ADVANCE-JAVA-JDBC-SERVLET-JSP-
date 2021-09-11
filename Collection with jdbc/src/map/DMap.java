package map;
import java.util.*;
public class DMap {
	public static void main(String args[]) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("=========Choice=======");
			System.out.println("1.HashMap\n2.LinkedHashMap\n3.TreeMap\n4.Hashtable");
			System.out.println("==========Enter a Choice=========");
			int choice=s.nextInt();
			Map<String,Values>m=new RetrieveDAO().retrieve(choice);
			System.out.println("========Display Product Details ========");
			m.forEach((k,v)->{
				String p=(String)k;
				Values q=(Values)v;
				System.out.println(p.toString()+"\t"+q.getpName()+"\t"+q.getpPrice()+"\t"+q.getpQty());
			});
			DBConnection.getCon().close();
			s.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
