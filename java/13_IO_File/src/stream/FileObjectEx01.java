package stream;

import java.io.File;
import java.io.IOException;

public class FileObjectEx01 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\_javaweb\\_java\\13_IO_File\\outFileByLine.txt");
		String fileName = f.getName();
		
		System.out.println("경로를 제외한 파일 이름 : " + f.getName());
		System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0, fileName.lastIndexOf(".")));
		System.out.println("확장자 : " + fileName.substring(fileName.lastIndexOf(".")+1));
		System.out.println("------------------------------------------");
		System.out.println("경로를 포함한 파일 이름 : " + f.getPath());
		System.out.println("파일의 절대경로 : " + f.getAbsolutePath());
		System.out.println("파일의 정규경로 : " + f.getCanonicalPath());
		System.out.println("파일이 속해있는 폴더  : " + f.getParent());
		System.out.println("------------------------------------------");
		System.out.println("파일 경로 구분자(분리구조) : " + File.pathSeparator);
		System.out.println("파일 경로 구분 문자 : " + File.pathSeparatorChar);
		System.out.println("파일 구분자 : " + File.separator);
		System.out.println("파일 구분문자 : " + File.separatorChar);
		System.out.println("------------------------------------------");
		System.out.println("사용자 폴더 : " + System.getProperty("user.dir"));
		System.out.println("자바 시작 경로 : "+ System.getProperty("sun.boot.class.path"));
		System.out.println("------------------------------------------");
		
	}

}
