package inter_basic;

public class Basic implements Inter1, Inter2{ 
	
	//인터페이스가 가지고 있는 추상 메소드 반드시 오버라이딩 해야함
	@Override
	public void method1() {
		System.out.println("오버라이딩 된 메서드 1번");
	}

	@Override
	public void method2() {
		System.out.println("오버라이딩 된 메서드 2번");
	}
}
