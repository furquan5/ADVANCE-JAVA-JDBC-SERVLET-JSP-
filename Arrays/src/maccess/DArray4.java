package maccess;
public class DArray4 {
	public static void main(String[] args) {
		Object a[]=new Object[3];
		a[0]=new Integer(123);
		a[1]=new String("Furquan");
		a[2]=new Product("abcd","hjkg",907,758);
		 
		
		System.out.println("Display from object using extended for loop");
		for(Object ob:a) {
			System.out.println(ob.toString()+"  ");
		}
		
		
		System.out.println("Display from object using normal for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
