package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in = null;

		try {
			server = new ServerSocket(5500);
			System.out.println("얘야 5500 번이란다.");
			Socket conncetion = server.accept();
			System.out.println("메세지 기다리는 중");

			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String message = "";

			while ((message = in.readLine()) != null) {
				if (message.contains("끝")) {
					System.out.println("서버종료");
					in.close();
					connection.close();
					server.close();
					break;
				}
				System.out.println("읽은 메세지" + message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
