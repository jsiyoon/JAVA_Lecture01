package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		//1. 1~100까지 정수중에  3의 배수이거나, 4의 배수일경우 가로로 출력
		int num1 = 1;
		System.out.print("3의 배수 OR 4의 배수:");
		
		while(num1 <= 100) {
			if(num1 % 3 == 0 || num1 % 4 == 0) {
				System.out.print(num1 + " ");
			}
			num1++;
		}
		System.out.println("\n");
		
		
		//2. 1~200까지 정수중 5의 배수 합
		int sum = 0;
		int num2 = 1;
		
		while(num2 <= 200) {
			if(num2 % 5 ==0) {
				sum += num2;
			}
			num2++;
		}
		System.out.println("1~200까지 정수중 5의 배수의 합:" + sum);
		System.out.println();
		
		
		//3. 1~200까지 정수중의 4의 배수이면서 8의 배수가 아닌 수의 개수
		int num3 = 1;
		int sum2 = 0;
		
		while(num3 <= 200) {
			if(num3 % 4 == 0 && num3 % 8 != 0) {
				sum2++;
			}
			num3++;
		}
		System.out.println("4의 배수이면서 8의 배수가 아닌 수의 개수:" + sum2);
		System.out.println();
		
		//4. 두 정수를 입력받아서 두 정수 사이의 합(같은 경우는없다)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수>");
		int num4 = scan.nextInt();
		
		System.out.print("두 번째 정수>");
		int num5 = scan.nextInt();
		
		int sum3 = 0;
		if(num4 > num5) {
			while(num5 <= num4) {
				System.out.print(num5);
				sum3 += num5;
				num5++;
				if(num5 <= num4) {
					System.out.print("+");
				}
			}
		}
		else {
			while(num4 <= num5) {
				System.out.print(num4);
				sum3 += num4;
				num4++;
				if(num4 <= num5) {
					System.out.print("+");
				}
			}
		}
		System.out.println("=" + sum3);
		
	}
}
