package ch18;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket client = null;
		PrintWriter out = null;
		// 서버와 연결
		try {
			client = new Socket();
			System.out.println("계십니까~~");
			client.connect(new InetSocketAddress("172.30.1.40", 5500), 3000);
			System.out.println("계시네요");

		} catch (Exception e) {
			System.out.println("연결 실패");
		}
		// 데이터 보내기
		Scanner in = new Scanner(System.in);
		try {
			out = new PrintWriter(client.getOutputStream(), true);
			String message = "";
			System.out.println("보낼 메세지가 있수광?");
			while ((message = in.nextLine()) != null) {
				if (message.contains("끝")) {
					System.out.println("해산!");
					out.close();
					in.close();
					client.close();
					break;
				}
				out.println(message);
				System.out.println("보낼 메세지가 있수광?");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
