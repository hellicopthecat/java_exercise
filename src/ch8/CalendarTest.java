package ch8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
		String[] noonName = { "오전", "오후" };

		// 코드추가
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		int weekNum = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int noonNum = cal.get(Calendar.AM_PM);
		String week = weekName[weekNum];
		String noon = noonName[noonNum];

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(week + "요일 " + noon);
		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");

		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM-dd");
		String formatted = ld.format(dtf);

		System.out.println(formatted);
	}

}
