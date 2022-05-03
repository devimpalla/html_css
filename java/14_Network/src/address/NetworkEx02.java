package address;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class NetworkEx02 {

	public static void main(String[] args) throws URISyntaxException, IOException {
		// URL = Uniformed Resource Location (정형화된 자원 위치)
		
		URL url = new URL("https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=101&oid=092&aid=0002239683\n");
		
		System.out.println("1 : " + url.getAuthority());
		System.out.println("2 : " + url.getContent());
		System.out.println("3 : " + url.getDefaultPort());
		System.out.println("4 : " + url.getPort());
		System.out.println("5 : " + url.getFile());
		System.out.println("6 : " + url.getHost());
		System.out.println("7 : " + url.getProtocol());
		System.out.println("------------------------------------");
		System.out.println("8 : " + url.getPath()); // path랑 query는 알아두기!
		System.out.println("9 : " + url.getQuery());
		System.out.println("------------------------------------");
		System.out.println("10 : " + url.getRef());
		System.out.println("11 : " + url.getUserInfo());
		System.out.println("12 : " + url.toExternalForm());
		System.out.println("13 : " + url.toURI());
	}

}
