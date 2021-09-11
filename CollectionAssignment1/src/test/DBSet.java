package test;
import java.util.*;
public class DBSet {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("========choices you have========");
			System.out.println("1.HashSet\n2.LinkedHashSet\n3.TreeSet");
			System.out.println("Enter a choice ......");
			int choice=s.nextInt();
			if(choice==1||choice==2||choice==3) {
				Set<BookBean>st=new RetrieveDAO().retrieve(choice);
				if(st.size()==0) {
					System.out.println("Books are not available ...");
				}else {
					System.out.println("======Display using Iterator<E>====");
				}
				Iterator<BookBean> it=st.iterator();
				while(it.hasNext()) {
					BookBean bb=(BookBean)it.next();
					System.out.println(bb.getBCODE()+"\t"+bb.getBNAME()+"\t"+bb.getBQTY()+"\t"+bb.getBPRICE());
				}//end of while loop
				System.out.println("=======Display using spliterator<E>========");
				Spliterator<BookBean> sit=st.spliterator();
				sit.forEachRemaining((k)->{
					BookBean bb=(BookBean)k;
					System.out.println(bb.getBCODE()+"\t"+bb.getBNAME()+"\t"+bb.getBQTY()+"\t"+bb.getBPRICE());
				});
				System.out.println("=======Display using forEach()======");
				st.forEach((k)->{
					BookBean bb=(BookBean)k;
					System.out.println(bb.getBCODE()+"\t"+bb.getBNAME()+"\t"+bb.getBQTY()+"\t"+bb.getBPRICE());
				});
			}else {
				System.out.println("Invalid choice...");
			}
			s.close();
		}catch(Exception e) {e.printStackTrace();}

	}

}
