package test;
import java.util.*;
public class DBSet {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("=====Choice=====");
			System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
			System.out.println("Enter a choice...");
			int choice=s.nextInt();
			if(choice==1||choice==2||choice==3) {
				Set<ProductBean>st=new RetrieveDAO().retrieve(choice);
				if(st.size()==0) {
					System.out.println("Products are not available...");
				}else {
					System.out.println("====Display Using Iterator<E>====");
				}
				Iterator<ProductBean> it=st.iterator();
				while(it.hasNext()) {
					ProductBean pb=(ProductBean)it.next();
					System.out.println(pb.getpCode()+"\t"+pb.getpName()+"\t"+pb.getpPrice()+"\t"+pb.getpQty());
				}//end of loop
				System.out.println("====Display using spliterator<T>======");
					Spliterator<ProductBean> sp=st.spliterator();
					sp.forEachRemaining((k)->
					{
						ProductBean pb=(ProductBean)k;
						System.out.println(pb.getpCode()+"\t"+pb.getpName()+"\t"+pb.getpPrice()+"\t"+pb.getpQty());
					});
						System.out.println("=====Display using forEach()=====");
						st.forEach((k)->
						{
							ProductBean pb=(ProductBean)k;
							System.out.println(pb.getpCode()+"\t"+pb.getpName()+"\t"+pb.getpPrice()+"\t"+pb.getpQty());

						});
	}else {
		System.out.println("Invalid choice....");
	}
			s.close();
	}catch(Exception e) {e.printStackTrace();}
}		
}