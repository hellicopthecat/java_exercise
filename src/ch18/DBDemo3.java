package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = makeConnection();
		// 3.prepared Statement 인터페이스 사용
		String sql = "update person set email = ? where id = ?;";
//		String sql = "insert into person (name, phone, email) values (?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, "a@google.com");
		statement.setInt(2, 1);
//		statement.setString(1, "하하하");
//		statement.setString(2, "010-5555-5555");
//		statement.setString(3, "ㅁㄴㅇㄹ@ㅁㄴㅇㄹ.ㅁㄴㄹㅇ");
		if (statement.executeUpdate() == 1) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}

		// 5.연결종료
		statement.close();
		con.close();
	}

	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul";
		Connection conn = null;
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connect to DB");
			// 2. db연결
			conn = DriverManager.getConnection(url, "root", "1111");
			System.out.println("DB is Connected..✔");

		} catch (ClassNotFoundException e) {
			System.out.println("Not Found JDBC Drivers");
		} catch (SQLException e) {
			System.out.println("DB connection is failed");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}

}
