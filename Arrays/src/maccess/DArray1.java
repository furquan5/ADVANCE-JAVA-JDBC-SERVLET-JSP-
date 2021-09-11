package maccess;
public class DArray1 {
	public static void main(String[] args) {
		Integer  a[]=new Integer[3];
		a[0]=new Integer(12);
		a[1]=new Integer(126);
		a[2]=new Integer(1245);
		
		System.out.println("Display from array using extended for loop");
		for(Integer z :a) {
			System.out.println(z.toString()+" ");
		}//end of loop 
		System.out.println("Display from array using old for loop method");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}//end of for loop
		
		//length keyword is used to get the length of an array......
	}

}
