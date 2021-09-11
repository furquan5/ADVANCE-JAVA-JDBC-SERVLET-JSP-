package maccess;
import java.io.*;
public class DFile1 {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		try {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the fpath&fname :(source)");
		File f1=new File(dis.readLine());
		FileInputStream fis=new FileInputStream(f1); //Constructor call
		System.out.println("Enter the fname and fpath:(destination)");
		File f2=new File(dis.readLine());
		FileOutputStream fos=new FileOutputStream(f2);//Constructor call
		int k;
		while((k=fis.read())!=-1) {
			fos.write(k);
			
		}
		System.out.println("File copied successfully");
		fis.close();
		fos.close();
		
		
		
		
			
		}catch(Exception e) {e.printStackTrace();}
	}

}
