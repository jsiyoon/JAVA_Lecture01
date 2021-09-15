package abs.good;

//추상클래스 상속받음
public class BusanStore extends HeadStore {

	@Override
	public void apple() {
		System.out.println("부산지점의 사과는 800원");
		
	}

	@Override
	public void banana() {
		System.out.println("부산지점의 바나나는 700원");
		
	}

	@Override
	public void grape() {
		System.out.println("부산지점의 포도는 600원");
		
	}

	@Override
	public void melon() {
		System.out.println("부산지점의 멜론은 500원");
		
	}
}
