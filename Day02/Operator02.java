package Day02;

public class Operator02 {
public static void main(String[] args) {
		
		//산술연산자
		int i = 7 / 3; //2 (몫)
		int j = 7 % 3; //1 (나머지)
		int k = 7 * 3; //21 
		
		//비교연산자
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i > j);
		System.out.println(i <= j);
		System.out.println(k % 2 == 0); //짝수인지 판별
		System.out.println(k % 2 != 1); //짝수인지 판별
		
		//비트연산자
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println(a & b); //0000 0001 -> 두 비트값이 1이여야 1
		System.out.println(a | b); //0000 0111 -> 비트값중 하나만 1이여도 1
		System.out.println(a ^ b); //0000 0110 -> 비트가 다르면 1, 그렇지 않으면 0
		
		//비트쉬프트
		int c = 192; //1100 0000
		System.out.println(c >> 3); //0001 1000
	}

}
