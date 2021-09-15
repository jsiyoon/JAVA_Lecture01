package Day03;

public class WhileEx01 {
	public static void main(String[] args) {
		
		int a = 1;//제어변수 만들어주기
				  //반복문 횟수 제어할 변수
		int sum = 0;
		
		while(a <= 10) {
			
			sum = sum + a;
			
			a++; //제어변수를 하나 증가해서 반복의 조건식이 언젠가 false되도록 처리
		}
		
		System.out.println("합계:" + sum);
	}
}
