package maccess;
import java.io.*;
public class DSerialize {
	public static void main(String args[]) {
		try {
			Book b1=new Book("A123","Core java");
			File f1=new File("G:\\FTJ'S MOVIE BOX\\ObjStore.txt");
			FileOutputStream fos=new FileOutputStream(f1);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(b1);
			oos.close();
			fos.close();
			System.out.println("Object state stored into file ...:");
			
		}catch(Exception e) {e.printStackTrace();}
	} 
}
