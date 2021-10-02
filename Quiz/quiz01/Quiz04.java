package quiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		//정수 2개를 받는다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자:");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자:");
		int num2 = scan.nextInt();
		
		//두수를 비교해  "x가 큰 수입니다"/ 같은 수이면 "같은 수 입니다" 출력
		if(num1 > num2) {
			System.out.println(num1 + "이 큰 수 입니다.");
		}
		else if(num2 > num1) {
			System.out.println(num2 + "이 큰 수 입니다.");
		}else {
			System.out.println("같은 수 입니다.");
		}
		scan.close();
	}
}
