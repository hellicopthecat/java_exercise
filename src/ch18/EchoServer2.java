package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 extends Thread {
	// 변수
	protected static boolean cont = true;
	protected Socket connection = null;

	// 생성자
	private EchoServer2(Socket clientSocket) {
		connection = clientSocket;
		start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		try {
			server = new ServerSocket(5500);
			while (cont) {
				System.out.println("얘야 5500 번이란다.");
				new EchoServer2(server.accept());
				System.out.println();
			}
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void run() {
		BufferedReader in = null;

		System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성");

		try {
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String message = "";

			while ((message = in.readLine()) != null) {
				if (message.contains("끝")) {
					in.close();
					connection.close();
					break;
				}
				System.out.println("읽은 메세지" + message);
			}
		} catch (Exception e) {

		}

	}

}
