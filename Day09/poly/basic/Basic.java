package poly.basic;

class A{}
class B extends A{}
class C extends A{}

public class Basic {
	//클래스타입 멤버변수
	A a = new A();
	B b = new B();
	//다형성
	A a1 = b; //B->A형변환
	
	byte x = 1;
	int y = x; //byte->int형 변환
	
	A a2 = new B(); //부모클래스에는 자식클래스 저장가능
	A a3 = new C();
	
	//Object는 자바의 가장 상위객체이므로
	//모든 객체 저장 가능.
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = "A";
	
}
