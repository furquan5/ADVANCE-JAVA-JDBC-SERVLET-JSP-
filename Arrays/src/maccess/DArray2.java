package maccess;
public class DArray2 {
	public static void main(String[] args) {
		String a[]=new String[3];
		a[0]=new String("Cat");
		a[1]=new String("is");
		a[2]=new String("Fast");
		
		System.out.println("Display from array using extended for");
		for(String str:a) {
			System.out.println(str.toString()+" ");
		}//end of loop 
		System.out.println("Display from array using normal for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
