package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		int max = 0, mid = 0, min =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 :");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 :");
		int num2 = scan.nextInt();
		System.out.print("세번째 정수 :");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1 > num3) {
			max = num1;
			if(num2 > num3) {
				mid = num2;
				min = num3;
			}
			else {
				mid = num3;
				min = num2;
			}
		}
		else if(num2 > num1 && num2 > num3) {
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			}
			else {
				mid = num3;
				min = num1;
			}
		}
		else {
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
			}
			else {
				mid = num2;
				min = num1;
			}
		}
		System.out.println("가장 큰 값 :" + max + ", 중간 값:" + mid + ", 가장 작은 값:" + min);
	}
}
