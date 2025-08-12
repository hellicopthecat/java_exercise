package ch8;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.MONTH);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(1));
		System.out.println(c.get(2) + 1);
		int month = c.get(2) + 1;
		String sMonth = String.valueOf(month);
		final String MONTH = sMonth.length() < 2 ? "0" + sMonth : sMonth;
		System.out.println(MONTH);

	}

}
