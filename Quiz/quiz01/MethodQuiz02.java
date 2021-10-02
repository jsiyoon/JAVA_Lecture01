package quiz01;

public class MethodQuiz02 {
	public static void main(String[] args) {
		
		System.out.println(java(7));
		
		System.out.println("7~9사이 수의 합:" + sumNum(7,9));
		System.out.println("9~7사이 수의 합:" + sumNum(9,7));
		System.out.println("5~5사이 수의 합:" + sumNum(5,5));
		
		System.out.println("자연수들의 합:" + nSum(10230543));
		
	}
	static String java(int a) {
		String str = "";
		String[] arr = {"자", "바"};
		for(int i = 0; i < a; i++) {
			if(i % 2 == 0) {
				str += arr[0];
			}
			else {
				str += arr[1];
			}
		}
		return str;
	}

	static int sumNum(int a, int b) {
		//sumNum은 매개변수 2개 받음
		//두 매개변수 사이에 속한 모든 정수의 합 구하는 sumNum
		//두 매개변수 크기 정하지 않음	
		int sum = 0;
		int num = 0;
		if(b < a) {
			num = a;
			a = b;
			b = num;
		}
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static int nSum(int n) {
		/*
		 * 자연수 자리수 합 구하기
		 * 자연수 n이 매개변수로 주어지면 n자리수 합 구해서 return하는 메서드
		 * 조건
		 * n은 1억 이하의 자연수
		 * n의 자료형을 바꾸면 안됩니다.
		 * ex) 10230543 -> 18
		 */
		int sum = 0;
			while(true) {
				if(n == 0) break;
				sum += (n % 10);
				n = (n / 10); 
			}
		return sum;
	}
	
}	
