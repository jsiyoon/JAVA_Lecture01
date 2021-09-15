package abs.good;

public class MainClass {
	public static void main(String[] args) {
		
		//1. 추상메서드는 오버라이딩을 강제화시켜, 프로그래머 실수 줄일 수 있음.
		SeoulStore s1 = new SeoulStore(); //다형성 사용
		System.out.println(s1.getName());
		s1.apple();
		s1.banana();
		s1.grape();
		s1.melon();
		s1.peach();
		
		System.out.println("------------------------------");
		
		//2. 추상메서드의 사용은 다형성의 원리를 안전하게 실행시켜주는 기능이기도 함.
		HeadStore s2 = new SeoulStore(); //다형성 사용
		System.out.println(s2.getName());
		
		s2.apple();
		s2.banana();
		s2.grape();
		s2.melon();
		s2.peach();
		
		System.out.println("------------------------------");
		
		HeadStore b1 = new BusanStore();
		System.out.println(b1.getName());
		b1.apple();
		b1.banana();
		b1.grape();
		b1.melon();
		b1.peach();
	}
}
