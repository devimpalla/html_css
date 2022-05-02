package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamOfFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		final String PATH_OUT = "outFile.txt";
		final String PATH_IN = "inFile.txt";
		
		
		try {
			fos = new FileOutputStream(PATH_OUT);
			fis = new FileInputStream(PATH_IN);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int n;
		
		try {
			while((n = fis.read()) != -1) {
				fos.write(n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(fis != null) {
			fis.close();
		}
		if(fos != null) {
			fos.close();
		}
	}

}
