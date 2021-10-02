package inter_basic;

public class MainClass {
	public static void main(String[] args) {
		
//		인터페이스는 클래스가 아님으로 객체생성 불가
//		Interface I1 = new Inter1();
		
//		Basic b = new Basic();
		Inter1 b = new Basic(); //다형성 사용
		b.method1(); //오버라이딩된 메서드 사용됨.
//		b.method2(); //Inter1으로 선언된 b는 Inter1기능만 사용가능
		
		Inter2 b2 = new Basic();
//		b2.method1(); //Inter2으로 선언된 b2는 Inter2기능만 사용가능
		b2.method2();
		//Interface로 구현하면 그 선언한Interface기능만 사용가능함
		
		Basic bb = new Basic();
		bb.method1();
		bb.method2();
		
		System.out.println("------------------------");
		
		//강제형변환을 이용하여 타입변환 시킴
		//Inter1기능만 가지던것을 Inter2의 기능도 사용할수 있게 변경
		//Interface도 클래스캐스팅이 가능하다는 뜻
		Basic bbb = (Basic)b;
		bbb.method1();
		bbb.method2();
		Basic bbbb = (Basic)b2;
		bbbb.method1();
		bbbb.method2();
		
		//Interface내 상수는 인터페이스이름.상수명 으로 사용.
		System.out.println(Inter1.PI);
		System.out.println(Inter2.ABC);
	}
}
