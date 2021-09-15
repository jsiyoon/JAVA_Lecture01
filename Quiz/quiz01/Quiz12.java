package quiz01;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0; //합계변수
		int num = 1;
		
		//0을 입력받을때까지 입력받은 정수 합함
		while(num != 0) {
		System.out.print("정수 입력>");
		num = scan.nextInt();
		
		sum += num;
		}
		System.out.println("입력받은 수의 합:" + sum);
	}
}
