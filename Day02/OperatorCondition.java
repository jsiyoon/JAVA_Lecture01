package Day02;

public class OperatorCondition {
	public static void main(String[] args) {
		
		//프로그램에서 랜덤한 숫자 출력
		//System.out.println( Math.random() ); //0이상 1미만 double형 랜덤값
		
		//1~10까지 랜덤값
//		double d = Math.random() * 10;
//		int result = (int)d + 1;
		
//		System.out.println(result); //1~10까지 랜덤숫자
		
		int result =(int)(Math.random() * 10) + 1;//중괄호, 계산순서의 중요성
		System.out.println(result);
		
		//3의 배수인지 판별
		String ran = result % 3 == 0 ? "3의 배수입니다." : "3의 배수가 아닙니다.";
		System.out.println(ran);
	}
}
