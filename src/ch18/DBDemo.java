package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = makeConnection();
		// 3.statement 생성
		Statement statement = con.createStatement();
		// 4. sql 문 실행
		String sql = "insert into person (name, phone, email) values ('SIUUUUUUU','010-3333-2222','a@naver.com')";
		if (statement.executeUpdate(sql) == 1) {
			System.out.println("추가 성공이여!!!");
		} else {
			System.out.println("실패야 꺼져!!!");
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
