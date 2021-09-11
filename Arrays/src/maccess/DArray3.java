package maccess;
public class DArray3 {
	public static void main(String[] args) {
		Product a[]=new Product[3];
		a[0]=new Product("A121","Mouse",1000,10);
		a[1]=new Product("A122","Keybd",2000,20);
		a[2]=new Product("A123","Desktp",3000,30);
		
		
		System.out.println("Display from product using extended for loop");
		for(Product p:a) {
			System.out.println(p.toString()+" ");
		}//end of loop
		
		System.out.println("Display from product using normal for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
