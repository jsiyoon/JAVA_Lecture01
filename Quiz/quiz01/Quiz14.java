package quiz01;

public class Quiz14 {
	public static void main(String[] args) {
		
		//1. 랜덤수 2~9랜덤 정수를 만들고, 구구단 출력
		int num1 = (int)(Math.random() * 8) + 2;

		for(int i = 1; i <= 9; i++) {
			//System.out.println(num1 + "x" + i + "=" + (num1 * i));
			System.out.printf("%d x %d = %d\n", num1, i, num1 * i);
		}
		System.out.println("----------------------------------");
		
		//2. 50~100까지 두 수 사이의 합
		int sum = 0;
	
		for(int j = 50; j <= 100; j++) {
			sum += j;
		}
		System.out.println("50~100까지 두수 사이의 합:" + sum);
		System.out.println("----------------------------------");
		
		//3. A~Z까지 문자를 가로로 출력
		for(char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a + " ");
		}
		System.out.println("\n----------------------------------");
		
		//4. 200까지 정수중의 If문 사용하지 않고 짝수만 출력
		for(int k = 2; k <= 200; k += 2) {
			System.out.println(k);
		}
	}
}
