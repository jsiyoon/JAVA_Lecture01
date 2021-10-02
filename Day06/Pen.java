package Day06;

//설계도 클래스는 main이 없음
public class Pen {
	//멤버변수 - 클래스의 속성을 나타냄.(필드)
	String ink;
	int price;
	String company;
	//ink = "빨강"; 이런 문법형식으로 표현 불가(메서드 안에서는 가능),
	//				멤버변수는 선언을 하거나 초기화를 한번에 해주어야 한다.
	
	
	//메서드 - 클래스 기능(값 변경도 메서드 안에서)
	void write() {
		System.out.println(ink + "색상 글씨를 씁니다.");
	}
	void info() {
		System.out.println("=====펜의 정보=====");
		System.out.println("색상:" + ink);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);
	}
}
