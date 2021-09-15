package quiz01;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1. 1~100까지 랜덤한 수 만들고 짝, 홀수 판별
		double a = (Math.random() * 100) + 1;
		int result = (int)a;
		System.out.println("0~100랜덤 값:" + result);
		
		String ran = result % 2 ==0 ? "짝수입니다" : "홀수입니다";
		System.out.println(ran + "\n");
		
		
		//2. -5~5까지 랜덤한 수 만들고, 절대값으로만 출력
		double b = Math.random() * 10 ;
		int result2 = (int)b - 5;
		
		System.out.println("-5에서 5까지 랜덤 값:" + result2);
		if(result2 < 0) {
			System.out.println("절대 값 :"+ -result2);
		}
		else {
			System.out.println("절대 값:" + result2);
		}
		
			
		//3. 1~150까지 랜덤한 수 사과의 개수로 가정, bucket의 변수는 사과를 담을 수 있는 양
		//필요한 bucket개수 구하기
		//ex)사과 148개 -> bucket : 15개 , 사과 150개 -> bucket : 15개
		int apple = (int)(Math.random() * 150) + 1;
		int bucket = apple / 10;
		System.out.println("사과개수:" + apple);
		System.out.println("필요한 bucket개수 :" + (apple % 10 == 0 ? bucket : bucket + 1) );
	}
}
