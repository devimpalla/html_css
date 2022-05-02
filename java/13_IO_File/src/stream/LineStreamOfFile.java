package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineStreamOfFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		PrintWriter pwr = null;
		
		final String PATH_OUT = "outFileByLine.txt";
		
		System.out.println("파일 복사를 시작하겠습니다.");
		
		try {
			br = new BufferedReader(new FileReader("inFile.txt"));
			pwr = new PrintWriter(new FileWriter(PATH_OUT));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사를 위한 객체 생성 완료");
		
		String line = "";
		
		try {
			while((line = br.readLine()) != null) {
				pwr.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 완료");
		
		if (br != null) {
			br.close();
		}
		if (pwr != null) {
			pwr.close();
		}
	}

}
