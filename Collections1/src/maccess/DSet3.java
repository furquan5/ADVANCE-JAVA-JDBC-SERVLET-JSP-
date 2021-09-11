package maccess;
import java.util.*;
public class DSet3 {
	public static void main(String[] args) {
		TreeSet<Integer> ts1=new TreeSet<Integer>();
							//TreeSet Integer WrapperClassobject
		ts1.add(new Integer(17));
		ts1.add(new Integer(07));
		ts1.add(new Integer(47));
		ts1.add(new Integer(27));
		ts1.add(new Integer(37));
		ts1.add(new Integer(77));
		
		System.out.println("======TreeSet Integer WrapperClassObject======");
		System.out.println(ts1.toString());
		
		TreeSet<String> ts2=new TreeSet<String>();
							//TreeSet String WrapperClassObject
		ts2.add(new String("Mobile"));
		ts2.add(new String("Tablet"));
		ts2.add(new String("keyboard"));
		ts2.add(new String("Mouse"));
		ts2.add(new String("Desktop"));
		ts2.add(new String("Laptop"));
		
		System.out.println("======TreeSet String WrapperClassObject======");
		System.out.println(ts2.toString());
				
		

	}

}
