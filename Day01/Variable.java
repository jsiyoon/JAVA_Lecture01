package Day01;

public class Variable {
	public static void main(String[] args) {
		/*
		 * 1.변수 선언방법
		 * 데이터타입 이름;
		 * 
		 * int 정수 저장하는 대표적 타입
		 * String 문자열을 저장하는 대표적인 타입
		 * 		
		 */
		int num;
		
		//초기화
		num = 10;
		
		System.out.println(num);
		
		//변수의 선언과 초기화를 동시에
		int num2 = 20;
		
		num2 = 100;
		num2 = 200;
		num2 = 300;
		
		System.out.println(num2);
	
		int result = num + num2 + 100;
		System.out.println(result);
		
		System.out.println("------------------------------");
	
		int a = 10;
		int b = 20;
		int result2;
		
		result2 = a + b;
		result2 = 1000;
		
		System.out.println(result2);
		
		System.out.println("------------------------------");
		//문자열을 저장
		String name = "정시윤";
		//변수는 타입이 다르면, 바로 저장할 수 없습니다.
		//int str = name;
	}
}
