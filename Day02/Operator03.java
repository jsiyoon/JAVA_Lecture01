package Day02;

public class Operator03 {
public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//논리연산자
		//소괄호가 true면 if중괄호를 실행, false면 else문실행
		//두개짜리 연산자는 만족할 수 없는 조건일 때 뒤를 실행하지 않는다.
		
		if(x != 10 && ++y == 21) { //거짓 && 참 --> 거짓
			System.out.println("참입니다.");
		}
		else {
			System.out.println("거짓입니다.");
		}
		
		System.out.println("x값 :" + x + ",y값 :" + y);
		
		if(x == 10 || ++y == 21) { //참 || 참 --> 참
			System.out.println("참입니다.");
		}
		else {
			System.out.println("거짓입니다.");
		}
		
		System.out.println("x값 :" + x + ",y값 :" + y);
	}
}
