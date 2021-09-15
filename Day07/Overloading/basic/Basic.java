package Overloading.basic;

public class Basic {
	/*
	 * 오버로딩 - 같은 이름의 메서드, 생성자를 여러개 만드는 것
	 * 
	 * 규칙
	 * 1.이름이 똑같음
	 * 2.반환유형은 상관없음
	 * 3.매개변수의 타입, 종류, 개수등이 다르면 됨.(완전히 동일하지 않으면 됨)
	 */
	void input(int a) {
		System.out.println("정수 1개 받음");
	}
	
//	int input(int b) {  <--같은 모양 쓰면 안됨!
//	}
	
	void input(String a) { //매개변수 타입 다르면 가능
		System.out.println("문자열 1개 받음");
	}
	
	void input(double a, int b) {
		System.out.println("정수와 실수  1개 받음");
	}
	
	void input(int a, double b) { //같은 매개변수여도, 매개변수 순서 바뀌어도 가능.
		System.out.println("실수와 정수 1개 받음");
	}
	
	void input(String a, String b) {
		System.out.println("문자열 2개 받음");
	}
	
	void input(char a, String b, double c) {
		System.out.println("문자, 문자열, 실수 1개 받음");
	}
}
