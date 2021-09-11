package maccess;
import java.io.*;
public class DFile2 {
	public static void main(String args[]) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			File f=new File("G:\\FTJ'S MOVIE BOX\\Image.jpg");
			FileWriter fw =new FileWriter(f);
			char ch1;
			System.out.println("Enter the data:(@ at end)");
			while((ch1=(char)br.read())!=-1){
			fw.write(ch1);
			}//end of loop
			fw.close();
			System.out.println("====Display the data from file===");
			FileReader fr = new FileReader(f);//Constructor call
			int k;
			while((k=fr.read())!=-1){
			System.out.print((char)k);
			}//end of while
			fr.close();
			
			
			
		}catch(Exception e) {e.printStackTrace();}
	}
}
