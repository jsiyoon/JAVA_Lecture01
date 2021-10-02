package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 단수를 입력하세요:");
		int num1 = scan.nextInt();
		
		System.out.println("랜덤 구구단 "+ num1 + "단");
		System.out.println("----------------------");
		
		int num2 = 1;
		
		while(num2 < 10) {
			System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
			num2++;
		}
	}
}
