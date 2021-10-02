package Quiz05;

public class MainClass {
	public static void main(String[] args) {
		
		/* 요구사항
	     * Calculator를 부모클래스로 선언하세요.
	     * Calculator를 상속받는 Computer클래스 생성 합니다.
	     * 
	     * Calculator의 멤버변수 result, pi를 선언하세요
	     * Calculator의 메서드
	     * add(int) - result에 값을 누적시키는 기능
	     * sub(int) - result에 값을 차감시키는 기능
	     * circle(int) - pi를 이용해서 원의 넓이를 구하는 기능
	     * 
	     * Computer클래스의 메서드 
	     * Math.PI를 사용해 원의 넓이를 구하도록 circle메서드를 구하세요.
	     * 
	     * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
	     * 
	     * -----------------------------------------------------
	     * 
	     * computer클래스에 rect메서드를 오버로딩
	     * rect메서드는 변의 길이를 매개값으로 받아
	     * 정사각형의 넓이, 직사각형의 넓이, 직육면체의 부피를 반환하도록 오버로딩
	     * 
	     */
		
		Calculator cal = new Calculator();
		System.out.println("계산기로 계산한 원의 넓이:" + cal.circle(5));
		
		Computer com = new Computer();
		System.out.println("컴퓨터로 계산한 원의 넓이:" + com.circle(5));
		
		System.out.println("-------------------------------------");
		
		System.out.println("정사각형의 넓이:" + com.rect(5));
		System.out.println("직사각형의 넓이:" + com.rect(7, 3));
		System.out.println("직육면체의 넓이:" + com.rect(9, 11, 5));
	}
}
