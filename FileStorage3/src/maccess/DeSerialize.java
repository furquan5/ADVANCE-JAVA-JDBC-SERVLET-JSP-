package maccess;
import java.io.*;
public class DeSerialize {
	public static void main(String args[]) {
		try {
			File f=new File("G:\\\\FTJ'S MOVIE BOX\\\\ObjStore.txt");
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Book b2 = (Book)ois.readObject();
			b2.getBook();
			ois.close();
			fis.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}
