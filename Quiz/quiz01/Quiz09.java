package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		
		//간단한 사칙연산이 되는 간략한 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 >");
		int num1 = scan.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String resault = scan.next();
		System.out.print("정수2>");
		int num2 = scan.nextInt();
		int num3 = 0;
		
		switch(resault) {
		
		case "+": 
			num3 = num1 + num2;
			System.out.println("두 수의 덧셈은 :" + num3);
			break;
		case "-":
			num3 = num1 - num2;
			System.out.println("두 수의 뺄셈은 :"+ num3);
			break;
		case "*":
			num3 = num1 * num2;
			System.out.println("두 수의 곱셈은:" + num3);
			break;
		case "/":
			num3 = num1 / num2;
			System.out.println("두 수의 나눗셈은 :" + num3);
			break;
		default:
			System.out.println("사칙연산 기호를 입력해 주세요.");
			System.out.println("[+, -, *, /]");
		}
		
	}
}
