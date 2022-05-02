package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class ObjectStreamOfFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		System.out.println("객체 복사 시작");
		
		oos = new ObjectOutputStream(new FileOutputStream("obj.dat"));
		oos.writeObject(LocalDateTime.now());
		oos.flush();
		
		ois = new ObjectInputStream(new FileInputStream("obj.dat"));
		System.out.println((LocalDateTime)ois.readObject());
		
		System.out.println("객체 복사 완료");
		if (oos != null) {
			oos.close();
		}
		if(ois != null) {
			ois.close();
		}
	}

}
