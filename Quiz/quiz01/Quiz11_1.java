package quiz01;

import java.util.Scanner;

public class Quiz11_1 {
	public static void main(String[] args) {
		
		//4. 두 정수를 입력받아서 두 정수 사이의 합(같은 경우는없다)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수>");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 정수>");
		int num2 = scan.nextInt();
		
		int max = num1 > num2 ? num1 : num2;
		int min = num1 < num2 ? num1 : num2;
		
		int result = 0;
		while(min <= max) {
			result += min;
			min++;
		}
		
		System.out.println("두수의 합:" + result);
	}
}
