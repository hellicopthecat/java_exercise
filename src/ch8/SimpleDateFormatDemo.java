package ch8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(s.format(d));
	}
}
