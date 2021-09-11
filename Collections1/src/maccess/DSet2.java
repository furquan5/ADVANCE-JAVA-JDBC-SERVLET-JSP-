package maccess;
import java.util.*;
public class DSet2 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ls1=new LinkedHashSet<Integer>();
							//LinkedHashSet Integer WrapperClassObject
		ls1.add(new Integer(10));
		ls1.add(new Integer(20));
		ls1.add(new Integer(30));
		ls1.add(new Integer(40));
		ls1.add(new Integer(50));
		ls1.add(new Integer(60));
		
		System.out.println("======LinkedHashSet Integer WrappperClassObject======");
		System.out.println(ls1.toString());
		
		
		LinkedHashSet<String> ls2=new LinkedHashSet<String>();
							//LinkedHashSet String WrapperClassObject
		ls2.add(new String("ECE"));
		ls2.add(new String("CSE"));
		ls2.add(new String("EEE"));
		ls2.add(new String("EIE"));
		ls2.add(new String("CE"));
		ls2.add(new String("ME"));
		ls2.add(new String("FT"));
		
		System.out.println("=====LinkedHashSet String WrapperClassObject=======");
		System.out.println(ls2.toString());
	}

}
