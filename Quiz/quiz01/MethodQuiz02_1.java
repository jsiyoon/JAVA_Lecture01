package quiz01;

public class MethodQuiz02_1 {
	public static void main(String[] args) {
		System.out.println(java(3));
		System.out.println(sum(5));
		System.out.println(PrimeNum(9));
		
		System.out.println(sumNum(7,9));
		System.out.println(sumNum(9,7));
		
		System.out.println(test(10230543));
		System.out.println(test(1234));
	}
	
	static String java(int a) {
		String str = "";
		for(int i = 1; i <=a; i++) {
			if(i%2 == 1) {
				str += "자";
			}
			else {
				str += "바";			}
		}
		return str;
	}
	static int sum(int a) {
		//자연수 n을 입력받아 약수를 모두 더한 값을 리턴하는 함수
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0)
				sum += i;
		}
		return sum;
	}
	
	static int PrimeNum(int a) {
		//1부터 입력받은 숫자 a사이에 있는 소수 개수 반환하는 함수 PrimeNum
		//소수는 1과 자기자신으로만 나누어 지는 수 (1은 소수 아님)
		int result = 0;
		ex :for(int i = 1; i <= a; i++) {
			
			int count = 0;

			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) result++;
			}
		return result;
	}
	
	static int sumNum(int a , int b) {
		int sum = 0;
		int max = a > b ? a : b;
		int min = b > a ? a : b;
		for(int i = min ; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int test(int a) {
		int sum = 0;
		for(int i = 100000000; i >= 1; i /=10) {
			if(a / i != 0) { //몫이 있는 경우
				sum += (a/i); //몫을 구해서 누적
				a %= i;
			}
		}
		return sum;
	}
}
