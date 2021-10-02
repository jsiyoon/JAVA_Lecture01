package quiz01;

public class Quiz02_2 {
	public static void main(String[] args) {
		
		//1. 1~100까지 랜덤한 수 만들고, 짝수홀수 판별
		int r =(int)(Math.random() * 100) +1;
		System.out.println("랜덤 값 :" + r);
		System.out.println(r%2 == 0? "짝수" : "홀수");
		
		//2. -5~5까지 랜덤한 수 만들고, 절대값으로 출력
		int r2 = 5 - (int)(Math.random() *11);
		System.out.println("랜덤 값:"+r2);
		System.out.println("절대 값:" + (r2 < 0 ? -r2 :r2));
		
		
		//3. 1~150까지 랜덤한 수 사과의 개수로 가정, bucket의 변수는 사과를 담을 수 있는 양
		//필요한 bucket개수 구하기
		//ex)사과 148개 -> bucket : 15개 , 사과 150개 -> bucket : 15개
		int bucket = 10;
		int apple = (int)(Math.random() * 150) + 1;
		System.out.println("사과 개수 :" + apple);
		System.out.println("바구니 개수:" + (apple % bucket == 0 ? apple/bucket : apple/bucket + 1));
		
	}
}
