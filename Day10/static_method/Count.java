package static_method;

public class Count {
	public int a; //일반 멤버변수
	public static int b;
	
	// 일반 메서드 선언 -> 일반 변수, static변수 모두 사용가능
	public int method() {
		a = 10;
		
		return ++b;
	}
	// static메서드 선언 -> 일반변수 사용불가, static변수사용가능
	public static int method2() {
//		a = 10; //static메서드에서는 일반변수 사용불가
		
		Count c = new Count(); //일반변수 사용하기 위해 객체 생성해서
		c.a = 10; 			   //이런 방식으로 사용해야함.
		
		return ++b;
	}
}
