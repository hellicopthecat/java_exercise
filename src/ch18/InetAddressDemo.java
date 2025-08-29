package ch18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		InetAddress addr1 = null, addr2 = null;
		System.out.println("호스트 이름을 입력하세요");

		String url = in.nextLine();

		try {
			addr1 = InetAddress.getByName(url);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			addr2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(addr1.getHostAddress());
		System.out.println(addr2.getHostAddress());
	}

}
