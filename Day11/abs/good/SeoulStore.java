package abs.good;

//추상클래스 상속받음
public class SeoulStore extends HeadStore{

	@Override
	public void apple() {
		System.out.println("서울지점의 사과는 500원");
	}

	@Override
	public void banana() {
		System.out.println("서울지점의 바나나는 600원");
		
	}

	@Override
	public void grape() {
		System.out.println("서울지점의 포도는 700원");
		
	}

	@Override
	public void melon() {
		System.out.println("서울지점의 멜론은 800원");
	}
}
