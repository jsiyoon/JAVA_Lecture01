package modi.protect.pac1;

public class A {
	/*
	 * protected는 기본적으로 같은 패키지에서만 사용할 수 있습니다.
	 * 단, 패키지가 다르더라도 상속관계에서 super통한 참조 허용
	 */
	//멤버변수
	protected int a;
	//생성자
	protected A() {
		
	}
	//메서드
	protected void method() {
		
	}
}
