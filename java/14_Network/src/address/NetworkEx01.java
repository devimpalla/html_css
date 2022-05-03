package address;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx01 {

	public static void main(String[] args) throws UnknownHostException {
		// java.net.* 패키지에 네트워크 관련 클래스가 있음
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		ip = InetAddress.getByName("www.naver.com");
		
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		System.out.println("ip.getHostName() : " + ip.getHostName());
		System.out.println("ip.toString() : " + ip.toString());
		
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress() : " + Arrays.toString(ipAddr));
		
		String result = "";
		for (int i = 0; i < ipAddr.length; i++) {
			result += (ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i];
			result += ".";
		}
		System.out.println("getAddress + 256 : " + result);
		System.out.println("-------------------------------------------");
		
		ip = InetAddress.getLocalHost();
		
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		System.out.println("ip.getHostName() : " + ip.getHostName());
		System.out.println("ip.toString() : " + ip.toString());
	}

}
