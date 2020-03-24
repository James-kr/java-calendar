package james.calendar;

import java.util.Scanner;

public class Calendar {

	public static final int[] MAX_DAY = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31 };

	public int getMaxDay(int month) {
		return MAX_DAY[month - 1];
	}

	public static void main(String[] args) {
//		System.out.println(" 월  화   수   목  금   토   일");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//		System.out.println("29 30 31 ");

		// 입력 받은 달의 최대 일수 출력하기
		// 입력: 키보드로부터 달 입력
		// 출력: 모니터로 최대 일수 출력

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 달을 입력하세요");
		
		while(true) {
			int month = scanner.nextInt();
			if (month > 12) {
				System.out.println("다시 입력하세요");
				continue;
			} else {
				Calendar cal = new Calendar();
				cal.getMaxDay(month);
				System.out.printf("%d의 최대일은 %d입니다.\n", month, cal.getMaxDay(month));
			}
		}


	}
}
