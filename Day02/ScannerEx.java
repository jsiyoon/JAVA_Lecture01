package Day02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//1.스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름>");
		String name = scan.next();//문자열
		
		System.out.print("나이>");
		int age = scan.nextInt();//정수
		
		System.out.println("키>");
		double cm = scan.nextDouble();//실수
		
		
		System.out.println("이름:" + name + ", 나이:" + age + ", 키:" + cm);
		
		//2. 스캐너 통로 종료(스캐너 자원 반납)
		scan.close();
		
	}
	
}
