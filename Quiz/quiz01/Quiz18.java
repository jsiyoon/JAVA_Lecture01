package quiz01;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		//가로,세로 입력받아서 직사각형 출력
		//단, 윤곽만 출력
		//먼저 사각형 만들고, 첫행, 마지막행, 첫열, 마지막열에만 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int num1 = scan.nextInt();
		
		System.out.print("세로>");
		int num2 = scan.nextInt();
		
		for(int i = 1; i <= num2; i++) {
			for(int j = 1; j <= num1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
