package Day01;

public class Casting03 {
	public static void main(String[] args) {
		
		//연산에서 형변환
		char c = 'A';
		int i = 2;
		
		//1. 서로다른 타입의 연산에서는 큰 타입 따라감
		char cc = (char)(c + i);
		System.out.println(cc);
		
		int j = 10;
		double d = 3.14;
		System.out.println(j+d);
		
		//2. int형보다 작은 타입 연산의 결과는 무조건 int
		byte a = 5;
		short b = 7;
		System.out.println(a+b); //<--int형으로 결과가 나옴
		
	}

}
