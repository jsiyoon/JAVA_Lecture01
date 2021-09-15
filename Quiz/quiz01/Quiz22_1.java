package quiz01;

import java.util.Scanner;

public class Quiz22_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count1 = 0, count2 = 0;
		
		while(true) {
			int num1 = (int)(Math.random() * 100) + 1;
			int num2 = (int)(Math.random() * 100) + 1;
			
			int num3 = (int)(Math.random() * 2);
			String[] chr = {"+", "-"};
			
			System.out.println("-------------------------");

			System.out.printf("%d %s %d = ?\n", num1, chr[num3], num2);
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(num3 == 0) {
				if(answer == num1 + num2) {
					System.out.println("정답입니다!!");
					count1 ++;
				}
				else {
					System.out.println("틀렸는데요??");
					count2 ++;
				}
			}
			else {
				if(answer == num1 - num2) {
					System.out.println("정답입니다!!");
					count1 ++;
				}
				else {
					System.out.println("틀렸는데요??");
					count2 ++;
				}
			}
			
			if(answer == 0 && num1 + num2 != 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		System.out.println("-------------------------");
		System.out.println("정답 횟수:" + count1 + "회");
		System.out.println("정답 횟수:" + count2 + "회");
	}
}
