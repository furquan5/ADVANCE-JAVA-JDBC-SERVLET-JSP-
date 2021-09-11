package maccess;
public class DArray5 {
	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5};
		Integer b[]= {10,11,12,13,14,15};
		Integer c[]= {20,21,22,23,24,25};
		
		Integer z[][]= {a,b,c};
		
		
		System.out.println("Display from Jagged ....");
		for(Integer i[]:z) {
			for(Integer j:i) {
				System.out.print(j+" ");
			}//end of inner loop
			System.out.println();
		}//end of outer loop

	}

}
