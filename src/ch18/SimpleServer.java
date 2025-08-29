package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("server is on 5000");
			Socket connection = server.accept();
			InputStream inputStream = connection.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			String message = (String) objectInputStream.readObject();
			System.out.println("받은 문자열 : " + message);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
