package Overloading.basic;

public class MainClass {
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(1);
		b.input("1");
		b.input(3.14, 1);
		b.input(1, 3.14);
		b.input("홍길동", "안녕하세용");
		b.input('a', "홍길동", 3.14);
		
//		Arrays.toString
//		Math.			오버로딩
	}
}
