package Day01;

public class Casting01 {
	public static void main(String[] args) {
		byte b = 10;
		
		short s = b; //byte->short형 변환
		int i = b; //short ->int형 변환
		long l = b; //int -> long형 변환
		
		System.out.println(s);
		
		char c = '가';
		int a = c;
		
		System.out.println("가의 유니코드 숫자 값" + a);
		
		int k =1000;
		double d = k; //int -> double형으로 자동형변환
		
		System.out.println();
	}

}
