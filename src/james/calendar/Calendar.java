package james.calendar;

import java.util.Scanner;

public class Calendar {

	public static final int[] MAX_DAY = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31 };
	public static final int[] LEAP_DAY = { 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31 };

	public boolean isleapYear (int year) {
		if (year %4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
		
	}

	public int getMaxDay(int year, int month) {
		if (isleapYear(year)) {
			return LEAP_DAY[month -1];
		} else {
			return MAX_DAY[month - 1];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년 %3d월>>\n", year, month);
		System.out.println(" SU MO TU WD TH FR SA");

		int maxDay = getMaxDay(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();

//		System.out.println("----------------------");
//		System.out.println(" 1  2  3  4  5   6  7");
//		System.out.println(" 8  9 10 11 12  13 14");
//		System.out.println("15 16 17 18 19  20 21");
//		System.out.println("22 23 24 25 26  27 28");
	}
}
