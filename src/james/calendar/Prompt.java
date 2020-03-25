package james.calendar;

import java.util.Scanner;

public class Prompt {
	
//	private static final String PROMPT = "cal> ";
	
	public void runPrompt () {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 1;
		
		while (true) {
			System.out.println("년도를 입력하세요: ");
			System.out.print("Year: ");
			year = scanner.nextInt();
			System.out.println("월을 입력하세요: ");
			System.out.print("Month: ");
			month = scanner.nextInt();
			
			if (month == -1) {
				break;
			}
			
			if (month > 12) {
				continue;
			}
//			System.out.printf("%d달은 %d일까지 있습니다",month, cal.getMaxDay(month));
			cal.printCalendar(year, month);
			
		}
		System.out.println("Bye~");
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
