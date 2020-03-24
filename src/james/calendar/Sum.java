package james.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력: 키보드 두수의 입력을 받는다
		// 출력: 모니터 합을 출력한다
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("enter two numbers");
		s1 = scanner.next();
		s2 = scanner.next();
		scanner.close();
		
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("두 수의 합은 %d입니다", a+b);
	}
}
