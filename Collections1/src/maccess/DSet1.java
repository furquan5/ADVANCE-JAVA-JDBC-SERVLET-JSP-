package maccess;
import java.util.*;
public class DSet1 {
	public static void main(String[] args) {
		HashSet<Integer> hs1=new HashSet<Integer>(); //HashSet object holding Integer wrapperClassObject
		
		hs1.add(new Integer(12600));
		hs1.add(new Integer(12600));
		hs1.add(new Integer(1260));
		hs1.add(new Integer(126));
		hs1.add(new Integer(12));
		hs1.add(new Integer(1));
		
		System.out.println("======Integer Wrapper Class Object======");
		System.out.println(hs1.toString());
		
		HashSet<String> hs2=new HashSet<String>(); //HashSet Object holding String WrapperClassObject
		
		hs2.add(new String("java"));
		hs2.add(new String("python"));
		hs2.add(new String("c++"));
		hs2.add(new String("c"));
		hs2.add(new String("Ruby"));
		hs2.add(new String("html"));
		
		System.out.println("=======String Wrapper Class object=======");
		System.out.println(hs2.toString());
		

	}

}
