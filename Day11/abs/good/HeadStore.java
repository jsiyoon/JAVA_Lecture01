package abs.good;

//추상 클래스 & 추상 메서드
//추상메서드는 오버라이딩 강제화 시킴.
public abstract class HeadStore { 
	//추상 메서드 있으면 클래스도 추상클래스여야 함.
	//추상클래스는 추상메소드를 사용하기 위한 클래스임
	
	//추상클래스는 일반변수, 일반메서드, 생성자 모두 가질수 있음.	
	
	private String name = "호식이과일가게"; //일반변수
	
	public HeadStore() { //생성자
		System.out.println("추상클래스의 생성자 호출");
	}
	
	public abstract void apple(); 
	public abstract void banana();
	public abstract void grape();
	public abstract void melon();
	
	public void peach() { //일반메서드
		System.out.println("복숭아는 모두 1000원");
	}
	public String getName() { //일반메서드
		return name;
	}
}
