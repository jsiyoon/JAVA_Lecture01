package quiz01;

public class Quiz01 {
	
	public static void main(String[] args) {
		int x =2;
		int y = 5;
		char c = 'A'; //ASCII A = 65
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2);//5
		System.out.println(!('A'<=c && c <= 'Z')); //false
		System.out.println('C'-c); //2 (int값보다 작은 타입의 계산의 결과는 int형)
		System.out.println(c+1); //66 (char형보다 int형이 크기때문에 결과값은 int형)
		System.out.println(++c); //B
		System.out.println(c++); //B
		System.out.println(c); //C
	}
}
