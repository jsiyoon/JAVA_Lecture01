package static_basic;

public class Calculator {
	//일반변수 선언 -> 객체별로 다른 값을 갖는경우
	private String color;
	private int result;
	
	//static변수 선언 -> 객체사이 동일한 값 갖는경우
	public static double pi = 3.14;
	public static double e = 2.71;
	
	//일반메서드
	public void setColor(String color) {
		this.color = color; //setter메서드가 static메서드가 되면 this사용불가
	}
	public String getColor() {
		return color;
	}
	public int add(int a) {
		result += a;
		return result;
	}
	
	//원의 넓이 구하는 메서드
	public static double Circle(int r) {
		return r * r * pi; //pi값을 바로 받아 사용하는 것이 좋아 static으로사용하면 효율성up
	}
}
